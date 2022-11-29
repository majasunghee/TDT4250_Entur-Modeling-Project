package tdt4250.entur.pluginProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class Fetcher  {
	public static void main(String[] args) {
		String url = "https://api.entur.io/journey-planner/v3/graphql";
		String queryString = "{lines { id name }}";
		
		fetcher(url, queryString);
	}
	
    public static void fetcher(String url, String queryString) {
        String line;
       
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;

        client = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);

        httpPost.addHeader("Accept", "application/json");
        httpPost.addHeader("Content-Type", "application/json");

          try {
             
        	StringEntity entity= new StringEntity("{\"query\":\"query "+queryString+"\"}");
            httpPost.setEntity(entity);

            
            response = client.execute(httpPost);

            BufferedReader bufReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuilder builder = new StringBuilder();

            while ((line = bufReader.readLine()) != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
            }

            System.out.println(builder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}