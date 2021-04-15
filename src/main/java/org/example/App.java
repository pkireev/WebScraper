package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class App 
{
    public static void main( String[] args ) {
        try {
            // Document doc = Jsoup.connect("https://quote.rbc.ru/catalog/").get();
            // String title = doc.title();

            URL url = new URL("https://quote.rbc.ru/catalog/");

            Document doc = Jsoup.parse(url, 3000);
            // System.out.println(doc);

            Elements links = doc.getElementsByTag("a");
            for (Element link : links) {
                String linkHref = link.attr("href");
                String linkText = link.text();

                System.out.println(linkHref);
                System.out.println(linkText);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
