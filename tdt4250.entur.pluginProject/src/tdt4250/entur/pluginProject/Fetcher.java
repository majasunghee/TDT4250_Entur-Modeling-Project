package tdt4250.entur.pluginProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class Fetcher  {
	
	public static void main(String[] args) throws IOException {
		
		String url = "https://api.entur.io/journey-planner/v3/graphql";
		
		//1. data fetch + write to file
		String queryLinesData = "{lines { id name transportMode bikesAllowed}}";
		
		String outputLinesData = jsonFetcher(url, queryLinesData);
		System.out.println(outputLinesData);
		String filename1 = "OutputLinesData.json";
		printToFile(filename1, outputLinesData);
		
		//2. data fetch + write to file
		String querySpecificLinesData = "{line(id: \\\"ATB:Line:2_311\\\") {id journeyPatterns{ name id line { quays {stopPlace { name }} journeyPatterns{ name directionType} operator{id name}}}}}";
		String outputSpecificLinesData = jsonFetcher(url, querySpecificLinesData);
		
		System.out.println(outputSpecificLinesData);
		String filename2 = "OutputSpecificLinesData.json";
		printToFile(filename2, outputSpecificLinesData);
		
		//3. data fetch + write to file
		String queryATBOperatorData = "{operator(id: \\\"ATB:Operator:267\\\") { id url lines{name}}}";
		String queryAllOperatorsData = "{operators { id url lines{name}}}";
		
		String outputAllOperatorsData = jsonFetcher(url, queryAllOperatorsData);
		System.out.println(outputAllOperatorsData);
		String filename3 = "OutputAllOperatorsData.json";
		printToFile(filename3, outputAllOperatorsData);
	
	}
	
    public static String jsonFetcher(String url, String queryString) {
        String line;
       
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;

        client = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);
        
        httpPost.addHeader("Content-Type", "application/json");

        StringBuilder sb = new StringBuilder();
        
          try {
        	StringEntity entity= new StringEntity("{\"query\":\"query "+queryString+"\"}");
        	
            httpPost.setEntity(entity);

            response = client.execute(httpPost);

            BufferedReader buffer = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));           
            
            while ((line = buffer.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
       
        } catch (IOException e) {
            e.printStackTrace();
        }
          
		return sb.toString();
    }
    
    public static void printToFile(String filename, String content) {
    	try (PrintWriter out = new PrintWriter("../tdt4250.entur.pluginProject/src/data/"+filename)) {
		    out.println(content);
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
    }
}