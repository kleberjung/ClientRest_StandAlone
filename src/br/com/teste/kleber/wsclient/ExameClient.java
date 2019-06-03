package br.com.teste.kleber.wsclient;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import br.com.teste.kleber.loader.XMLParser;
import br.com.teste.kleber.model.Exame;

public class ExameClient {
	
	private static final String WS_URL = "http://localhost:8080/DWP_Rest/rest/exameWS/getExame";
	
	public Exame getExame() {
		
		Exame exame = new Exame();
		
		HttpURLConnection conn = null;
		try {
			URL wsUrl = new URL(WS_URL);
			conn = (HttpURLConnection)wsUrl.openConnection();
			InputStream content = conn.getInputStream();
			exame = new XMLParser().convertFromXML(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
		
		return exame;
		
	}
	
	

}
