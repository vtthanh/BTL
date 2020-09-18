package Application;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import database.DBManager;
import database.Database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class main {
    //api translate hiện tại thì ko dùng đến :V
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
////        String text = sc.nextLine();
//        //Translated text: Hallo Welt!
//        //System.out.println("Translated text: " + translate("en", "vi", text));
//        Translator translate = Translator.getInstance();
//        String text = translate.translate("I am programmer", Language.ENGLISH, Language.VIETNAMESE);
//        System.out.println(text);
//    }
//
//    private static String translate(String langFrom, String langTo, String text) throws IOException {
//        // INSERT YOU URL HERE
//        String urlStr = "https://script.google.com/macros/s/AKfycbymlGm0Gx_n06zlvW00zR4dxAkKEoBk1psUhKuuumG7Tn66yZ0/exec" +
//                "?q=" + URLEncoder.encode(text, "UTF-8") +
//                "&target=" + langTo +
//                "&source=" + langFrom;
//        URL url = new URL(urlStr);
//        StringBuilder response = new StringBuilder();
//        HttpURLConnection con = (HttpURLConnection) url.openConnection();
//        con.setRequestProperty("User-Agent", "Mozilla/5.0");
//        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//        String inputLine;
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//        return response.toString();
//    }
    //test
    public static void main(String[] args) {
        DBManager manager = new DBManager();
    }

}
