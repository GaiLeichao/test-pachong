package main.com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class TestJsoup {

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://bz.zzzmh.cn/#classify").get();

//        System.out.println("title   :   " + document.title());
//        System.out.println("location    :   " + document.location());
//        System.out.println("nodeName    :   " + document.nodeName());
        System.out.println("outerHtml   :   " + document.outerHtml());
//        System.out.println("getElementById : " + document.getElementById("s_top_wrap"));
        Elements selects = document.select("img[src]");
        System.out.println("数据长度 : " + selects.size());

        for (int i = 0; i < selects.size(); i++) {
            System.out.println("第"+i+"个元素 : "+selects.get(i).text() + "   :  "+selects.get(i).attr("href"));
        }


    }
}
