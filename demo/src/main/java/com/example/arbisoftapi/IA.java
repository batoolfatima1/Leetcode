package com.example.arbisoftapi;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class IA {
    public static void main(String[] args) {
        try
        {
            String sURL = "https://www.jsonkeeper.com/b/ITZH"; //just a string
            URL url = new URL(sURL);
            URLConnection request = url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JSONParser jp = new JSONParser(); //from gson
           // JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
           // JSONObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
            //String zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
