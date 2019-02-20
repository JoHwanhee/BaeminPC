import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpServerTest {
    @Test
    public void localhost에_접속시_ok_출력(){
        ServerStart();

        Assert.assertTrue(request().equals("ok"));
    }

    public void ServerStart(){
        HttpServer server = new HttpServer(8080);
        server.start();
    }

    public String request(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://127.0.0.1:8080"); /*URL*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            return sb.toString();
        }
        catch (Exception e){

        }

        return null;
    }
}
