package com.cygi.webService.ConnectingTheWeb;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	String address = "http://www.amazon.com/index.html"; 
    	String address2 = "http://proline.pl";
		try {
			
			URL url = new URL(address2);
			
			
				URLConnection sock = url.openConnection();
			
				Map<String, List<String>> headerValues = new HashMap<String, List<String>>();
				
				headerValues =   sock.getHeaderFields();
				
				
				
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String  next_record = null;
				
				while ((next_record = reader.readLine()) != null) {
					
					System.out.println(next_record);
					
					
				}
				reader.close();
				
		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	
    }
}
