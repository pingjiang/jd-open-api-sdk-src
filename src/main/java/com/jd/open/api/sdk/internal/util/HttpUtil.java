// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HttpUtil.java

package com.jd.open.api.sdk.internal.util;

import com.jd.open.api.sdk.FileItem;
import com.jd.open.api.sdk.JdException;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jd.open.api.sdk.internal.util:
//            DefaultTrustManager, StringUtil

public class HttpUtil {

    private HttpUtil() {
        throw new UnsupportedOperationException();
    }

    public static String buildQuery(Map params, String charset)
            throws Exception {
        if (params == null || params.isEmpty())
            return null;
        StringBuilder query = new StringBuilder();
        Set entries = params.entrySet();
        boolean hasParam = false;
        Iterator i$ = entries.iterator();
        do {
            if (!i$.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry) i$.next();
            String name = (String) entry.getKey();
            String value = (String) entry.getValue();
            if (StringUtil.areNotEmpty(new String[]{
                    name, value
            })) {
                if (hasParam)
                    query.append("&");
                else
                    hasParam = true;
                query.append(name).append("=").append(URLEncoder.encode(value, charset));
            }
        } while (true);
        return query.toString();
    }

    public static String doPost(String url, Map params, int connectTimeout, int readTimeout)
            throws Exception {
        return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
    }

    public static String doPost(String url, Map params, String charset, int connectTimeout, int readTimeout)
            throws Exception {
        String ctype = (new StringBuilder()).append("application/x-www-form-urlencoded;charset=").append(charset).toString();
        String query = buildQuery(params, charset);
        byte content[] = new byte[0];
        if (query != null)
            content = query.getBytes(charset);
        return doPost(url, ctype, content, connectTimeout, readTimeout);
    }

    public static String doPost(String url, Map params, Map fileParams, int connectTimeout, int readTimeout)
            throws Exception {
        if (fileParams == null || fileParams.isEmpty())
            return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
        else
            return doPost(url, params, fileParams, "UTF-8", connectTimeout, readTimeout);
    }

    public static String doPost(String url, Map params, Map fileParams, String charset, int connectTimeout, int readTimeout)
            throws IOException, JdException {
        String boundary;
        HttpURLConnection conn;
        OutputStream out;
        String rsp;
        boundary = (new StringBuilder()).append(System.currentTimeMillis()).append("").toString();
        conn = null;
        out = null;
        rsp = null;

        // 建立连接
        try {
            String ctype = (new StringBuilder()).append("multipart/form-data;charset=").append(charset).append(";boundary=").append(boundary).toString();
            conn = getConnection(new URL(url), "POST", ctype);
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
        } catch (IOException e) {
            throw new JdException(e);
        }
        try {
            out = conn.getOutputStream();
            byte entryBoundaryBytes[] = (new StringBuilder()).append("\r\n--").append(boundary).append("\r\n").toString().getBytes(charset);
            Set textEntrySet = params.entrySet();
            byte textBytes[];
            for (Iterator i$ = textEntrySet.iterator(); i$.hasNext(); out.write(textBytes)) {
                java.util.Map.Entry textEntry = (java.util.Map.Entry) i$.next();
                textBytes = getTextEntry((String) textEntry.getKey(), (String) textEntry.getValue(), charset);
                out.write(entryBoundaryBytes);
            }

            Set fileEntrySet = fileParams.entrySet();
            byte content[];
            for (Iterator i$ = fileEntrySet.iterator(); i$.hasNext(); out.write(content)) {
                java.util.Map.Entry fileEntry = (java.util.Map.Entry) i$.next();
                FileItem fileItem = (FileItem) fileEntry.getValue();
                byte fileBytes[] = getFileEntry((String) fileEntry.getKey(), fileItem.getFileName(), fileItem.getMimeType(), charset);
                out.write(entryBoundaryBytes);
                out.write(fileBytes);
                content = fileItem.getContent();
                content = content != null ? content : new byte[0];
            }

            byte endBoundaryBytes[] = (new StringBuilder()).append("\r\n--").append(boundary).append("--\r\n").toString().getBytes(charset);
            out.write(endBoundaryBytes);
            rsp = getResponseAsString(conn);
        } catch (IOException e) {
            throw new JdException(e);
        } finally {
            if (out != null)
                out.close();
            if (conn != null)
                conn.disconnect();
        }

        return rsp;
    }

    public static String doPost(String url, String ctype, byte content[], int connectTimeout, int readTimeout)
            throws IOException {
        HttpURLConnection conn;
        OutputStream out;
        String rsp;
        conn = null;
        out = null;
        rsp = null;
        try {
            conn = getConnection(new URL(url), "POST", ctype);
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            out = conn.getOutputStream();
            out.write(content);
            rsp = getResponseAsString(conn);
        } finally {
            if (out != null)
                out.close();
            if (conn != null)
                conn.disconnect();
        }
        return rsp;
    }

    private static HttpURLConnection getConnection(URL url, String method, String ctype)
            throws IOException {
        HttpURLConnection conn = null;
        if ("https".equals(url.getProtocol())) {
            SSLContext ctx = null;
            try {
                ctx = SSLContext.getInstance("TLS");
                ctx.init(new KeyManager[0], new DefaultTrustManager[]{
                        new DefaultTrustManager()
                }, new SecureRandom());
            } catch (Exception e) {
                throw new IOException(e);
            }
            HttpsURLConnection connHttps = (HttpsURLConnection) url.openConnection();
            connHttps.setSSLSocketFactory(ctx.getSocketFactory());
            connHttps.setHostnameVerifier(new HostnameVerifier() {

                                              public boolean verify(String hostname, SSLSession session) {
                                                  return true;
                                              }

                                          }
            );
            conn = connHttps;
        } else {
            conn = (HttpURLConnection) url.openConnection();
        }
        conn.setRequestMethod(method);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
        conn.setRequestProperty("User-Agent", "360buy-sdk-java");
        conn.setRequestProperty("Content-Type", ctype);
        return conn;
    }

    protected static String getResponseAsString(HttpURLConnection conn)
            throws IOException {
        String charset = getResponseCharset(conn.getContentType());
        InputStream es = conn.getErrorStream();
        if (es == null)
            return getStreamAsString(conn.getInputStream(), charset);
        String msg = getStreamAsString(es, charset);
        if (StringUtil.isEmpty(msg))
            throw new IOException((new StringBuilder()).append(conn.getResponseCode()).append(":").append(conn.getResponseMessage()).toString());
        else
            throw new IOException(msg);
    }

    private static String getStreamAsString(InputStream stream, String charset)
            throws IOException {
        String s;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
            StringWriter writer = new StringWriter();
            char chars[] = new char[256];
            for (int count = 0; (count = reader.read(chars)) > 0; )
                writer.write(chars, 0, count);

            s = writer.toString();
        } finally {
            if (stream != null)
                stream.close();
        }
        return s;
    }

    private static String getResponseCharset(String ctype) {
        String charset = "UTF-8";
        if (!StringUtil.isEmpty(ctype)) {
            String params[] = ctype.split(";");
            String arr$[] = params;
            int len$ = arr$.length;
            int i$ = 0;
            do {
                if (i$ >= len$)
                    break;
                String param = arr$[i$];
                param = param.trim();
                if (param.startsWith("charset")) {
                    String pair[] = param.split("=", 2);
                    if (pair.length == 2 && !StringUtil.isEmpty(pair[1]))
                        charset = pair[1].trim();
                    break;
                }
                i$++;
            } while (true);
        }
        return charset;
    }

    private static byte[] getTextEntry(String fieldName, String fieldValue, String charset)
            throws IOException {
        StringBuilder entry = new StringBuilder();
        entry.append("Content-Disposition:form-data;name=\"");
        entry.append(fieldName);
        entry.append("\"\r\nContent-Type:text/plain\r\n\r\n");
        entry.append(fieldValue);
        return entry.toString().getBytes(charset);
    }

    private static byte[] getFileEntry(String fieldName, String fileName, String mimeType, String charset)
            throws IOException {
        StringBuilder entry = new StringBuilder();
        entry.append("Content-Disposition:form-data;name=\"");
        entry.append(fieldName);
        entry.append("\";filename=\"");
        entry.append(fileName);
        entry.append("\"\r\nContent-Type:");
        entry.append(mimeType);
        entry.append("\r\n\r\n");
        return entry.toString().getBytes(charset);
    }

    public static final String DEFAULT_CHARSET = "UTF-8";
    private static final String METHOD_POST = "POST";
}
