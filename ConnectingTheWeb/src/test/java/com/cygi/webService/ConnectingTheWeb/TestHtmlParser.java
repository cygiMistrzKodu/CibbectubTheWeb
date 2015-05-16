package com.cygi.webService.ConnectingTheWeb;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class TestHtmlParser {

	
	
	@Test
	public void ReadHtmlTag() throws IOException {
		
		String path = "D:\\PogodaPrzetwarzanie\\StronaPogoda.html";
		
		
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		
		String htmlPage =  new String(encoded, Charset.defaultCharset());
		
		Document doc = Jsoup.parseBodyFragment(htmlPage);
		
		Element body = doc.body();
				body.getAllElements();
	//	System.out.println(htmlPage);
		System.out.println(body);
		
	}

}
