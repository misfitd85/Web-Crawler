import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scraper {

    public static void main(String[] args) throws IOException {

        //Document
       Document doc;
        //String input;
        doc = Jsoup.parse( "UTF-8", "https://marvelsnapzone.com/cards/");
                Jsoup.connect("https://marvelsnapzone.com/cards/").timeout(6000).get();

                System.out.println(doc.html());

         //div with class = simple card
         Elements body = doc.select("*");
        System.out.println(body.select("*").size());

        for(Element e : body.select("a.class")){
            String img = e.select("a.simple-card").attr("src");
            System.out.println(img);
        }


    }


}
