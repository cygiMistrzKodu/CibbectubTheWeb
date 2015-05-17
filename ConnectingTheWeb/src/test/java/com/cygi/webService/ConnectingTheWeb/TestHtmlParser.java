package com.cygi.webService.ConnectingTheWeb;

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
				
				
		// pandora pandora		klip klap  dup dupa dupa merge
		
				// juz nie bla bla juz jestem w drugim eklipise bum bum
				
	//	System.out.println(htmlPage);
		System.out.println(body);
		
	}

}
