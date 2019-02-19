package com.wugenqiang;

/*
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
*/

/**
 * @Classname com.wugenqiang.DataLearnerCrawler
 * @Description TODO
 * @Date 2019/2/19 12:57
 * @Created by WuGenQiang//fighting!!
 */
public class DataLearnerCrawler {
    /*public static void main(String[] args) {
        List<String> titles = new ArrayList<String>();
        List<String> urls = new ArrayList<String>();
//假设我们获取的HTML的字符内容如下
        String html = "<html><div id=\"blog_list\"><div class=\"blog_title\"><a href=\"url1\">第一篇博客</a></div><div class=\"blog_title\"><a href=\"url2\">第二篇博客</a></div><div class=\"blog_title\"><a href=\"url3\">第三篇博客</a></div></div></html>";
//第一步，将字符内容解析成一个Document类
        Document doc = Jsoup.parse(html);
//第二步，根据我们需要得到的标签，选择提取相应标签的内容
        Elements elements = doc.select("div[id=blog_list]").select("div[class=blog_title]");
        for( Element element : elements ){
            String title = element.text();
            titles.add(title);
            urls.add(element.select("a").attr("href"));
        }
//输出测试
        for( String title : titles ){
            System.out.println(title);
        }
        for( String url : urls ){
            System.out.println(url);
        }
    }*/
}