package com.wugenqiang;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Classname com.wugenqiang.DataLearnerCrawler
 * @Description TODO
 * @Date 2019/2/19 12:57
 * @Created by WuGenQiang//fighting!!
 */
public class DataCrawler {
    public static void main(String[] args) {
        String url = "https://blog.csdn.net/wugenqiang/article/list/2";
        String rawHTML = null;
        try {
            rawHTML = getHTMLContent(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
//将当前页面转换成Jsoup的Document对象
        Document doc = Jsoup.parse(rawHTML);
//获取所有的博客列表集合
        Elements blogList = doc.select("div[data-articleId]");
//针对每个博客内容进行解析，并输出
        for (Element element : blogList) {
            String title = element.select("h4[class]").text().substring(2);
            String content = element.select("p[class=content]").text();

            System.out.println("Title:\t" + title);
            System.out.println("introduction:\t" + content);
            System.out.println("--------------------------");
        }
    }
    //根据url地址获取对应页面的HTML内容，我们将上一节中的内容打包成了一个方法，方便调用
    private static String getHTMLContent( String url ) throws IOException {
//建立一个新的请求客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
//使用HttpGet方式请求网址
        HttpGet httpGet = new HttpGet(url);
//获取网址的返回结果
        CloseableHttpResponse response = httpClient.execute(httpGet);
//获取返回结果中的实体
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
//关闭HttpEntity流
        EntityUtils.consume(entity);
        return content;
    }
}
