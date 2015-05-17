package com.cygi.webService.ConnectingTheWeb;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class TestHtmlParser {

	
	
	@Test
	public void ReadHtmlTag() throws IOException {
		
		String path = "D:\\PogodaPrzetwarzanie\\StronaPogoda.html";
		
		
//		byte[] encoded = Files.readAllBytes(Paths.get(path));
//		
//		String htmlPage =  new String(encoded, Charset.defaultCharset());
		
	//	Document doc = Jsoup.parseBodyFragment(htmlPage);	
		
	//	Element body = doc.body();
		
		File input = new File(path);
		
		Document doc = Jsoup.parse(input, "UTF-8");
		
		Elements content = doc.getElementsByAttribute("title");
		
//		System.out.println(content);
//		System.out.println("-------------------------------------------");		
		
		for (Element htmlElement : content)
		{
				System.out.println("************************************************");
			System.out.println(htmlElement);
			System.out.println(htmlElement.tagName());
			System.out.println(htmlElement.outerHtml());
			System.out.println("--------------------------------------------------------");
			
			for (org.jsoup.nodes.Attribute attributes : htmlElement.attributes()) {
				
				System.out.println(attributes);
				
			}
			
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}
		
	//	System.out.println(body);
		
	}

}
