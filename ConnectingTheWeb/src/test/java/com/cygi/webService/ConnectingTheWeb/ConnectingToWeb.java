package com.cygi.webService.ConnectingTheWeb;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

public class ConnectingToWeb {

	@Test
	public void takeWhetherTemperatureFromSiteAndDisplayItForTwonWroclaw() throws IOException {
		
		String site = "http://www.twojapogoda.pl/";
		
		
		
		Document doc = Jsoup.connect(site).get();
		
		Elements tableWithWether = doc.select("div.map-wrapper");
		
		//Elements wroclawTown = tableWithWether.select("p.name:contains(Wrocław)");
		Elements wroclawTown = tableWithWether.select("a:contains(Wrocław)");
		
		//String title = doc.body().html();
		
		Elements temperature = wroclawTown.select("p.value");
		
	//	System.out.println(wroclawTown);
		System.out.println(temperature.text());
		//System.out.println(tableWithWether);
		
		System.out.println("Temperatura we Wrocławiu jutro : " + temperature.text());
		
	}

}
