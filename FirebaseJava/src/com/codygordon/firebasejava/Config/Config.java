package com.codygordon.firebasejava.Config;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import com.google.firebase.database.snapshot.NamedNode;

public class Config {

	private static boolean initialized = false;
	private static Document doc;

	private static void initConfig() {
		try {
			String url = "src/com/codygordon/firebasejava/Config/config.xml";
			File file = new File(url);
			DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = factory.newDocumentBuilder();
			doc = docBuilder.parse(file);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getElementValue(String tagName ) {
		checkInitialized();
		NamedNodeMap attributes = doc.getAttributes();
		NodeList nodeList = doc.getChildNodes();
		NodeList nodes = doc.getElementsByTagName(tagName);
		return nodes.item(0).getNodeValue();
	}
	
	private static void checkInitialized() {
		if(!initialized) {
			initConfig();
			initialized = true;
		}
	}
}