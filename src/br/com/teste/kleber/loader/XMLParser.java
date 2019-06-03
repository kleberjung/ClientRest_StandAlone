package br.com.teste.kleber.loader;

import java.io.InputStream;

import br.com.teste.kleber.model.Exame;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLParser {
	
	public Exame convertFromXML(InputStream inputStream) {
		Exame exame = new Exame();
		XStream stream = new XStream(new DomDriver());
		stream.alias("Exame", Exame.class);
		exame = (Exame) stream.fromXML(inputStream);
		return exame;
	}

}
