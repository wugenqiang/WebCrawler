package com.wugenqiang;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname RequestWithCookie
 * @Description TODO
 * @Date 2019/2/19 13:15
 * @Created by WuGenQiang//fighting!!
 */
//public class RequestWithCookie {
//    public static void main(String[] args) throws URISyntaxException, IOException, ClassNotFoundException {
////待请求的地址
//        String url = "http://www.datalearner.com";
////请求参数
//        List<NameValuePair> loginNV = new ArrayList<NameValuePair>();
//        loginNV.add(new BasicNameValuePair("userName", "test"));
//        loginNV.add(new BasicNameValuePair("passWord", "test"));
////构造请求资源地址
//        URI uri = new URIBuilder(url).addParameters(loginNV).build();
////创建一个HttpContext对象，用来保存Cookie
//        HttpClientContext httpClientContext = HttpClientContext.create();
////构造自定义Header信息
//        List<Header> headerList = new ArrayList<Header>();
//        headerList.add(new BasicHeader(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9," +
//                "image/webp,image/apng,*/*;q=0.8"));
//        headerList.add(new BasicHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
//                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36"));
//        headerList.add(new BasicHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate"));
//        headerList.add(new BasicHeader(HttpHeaders.CACHE_CONTROL, "max-age=0"));
//        headerList.add(new BasicHeader(HttpHeaders.CONNECTION, "keep-alive"));
//        headerList.add(new BasicHeader(HttpHeaders.ACCEPT_LANGUAGE, "zh-CN,zh;q=0.8,en;q=0.6,zh-TW;q=0.4,ja;q=0.2," +
//                "de;q=0.2"));
////构造自定义的HttpClient对象
//        HttpClient httpClient = HttpClients.custom().setDefaultHeaders(headerList).build();
////构造请求对象
//        HttpUriRequest httpUriRequest = RequestBuilder.get().setUri(uri).build();
////执行请求，传入HttpContext，将会得到请求结果的信息
//        httpClient.execute(httpUriRequest, httpClientContext);
////从请求结果中获取Cookie，此时的Cookie已经带有登录信息了
//        CookieStore cookieStore = httpClientContext.getCookieStore();
////这个CookieStore保存了我们的登录信息，我们可以先将它保存到某个本地文件，后面直接读取使用
//        saveCookieStore(cookieStore, "cookie");
////下面我们将演示如何使用Cookie来请求，首先我们将之前的Cookie读出来
//        CookieStore cookieStore1 = readCookieStore("cookie");
////构造一个带这个Cookie的HttpClient
//        HttpClient newHttpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore1).build();
////使用这个新的HttpClient请求就可以了。这时候我们的HttpClient已经带有了之前的登录信息，再爬取就不用登录了
//        newHttpClient.execute(httpUriRequest, httpClientContext);
//    }
//
//   /* //使用序列化的方式保存CookieStore到本地文件，方便后续的读取使用
//    private static void saveCookieStore(CookieStore cookieStore, String savePath) throws IOException {
//        FileOutputStream fs = new FileOutputStream(savePath);
//        ObjectOutputStream os = new ObjectOutputStream(fs);
//        os.writeObject(cookieStore);
//        os.close();
//    }*/
//
//   /* //读取Cookie的序列化文件，读取后可以直接使用
//    private static CookieStore readCookieStore(String savePath) throws IOException, ClassNotFoundException {
//        FileInputStream fs = new FileInputStream("cookie");//("foo.ser");
//        ObjectInputStream ois = new ObjectInputStream(fs);
//        CookieStore cookieStore = (CookieStore) ois.readObject();
//        ois.close();
//        return cookieStore;
//    }*/
//}