package com.dylankilbride.itunesbackup.parser;

import com.dylankilbride.itunesbackup.entities.Track;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class ItunesXmlParser {

	ArrayList<Map> trackList = new ArrayList<>();
	Map<String, String> xmlData;
	Map<String, Track> trackMap;

	//TODO remove main
	public static void main(String[] args) {
		ItunesXmlParser iTunesBackupParser = new ItunesXmlParser();
		File file = new File("ITunesMusicLibrary.xml");
		iTunesBackupParser.fileParser(file);
	}

	public void fileParser(File xmlFile) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document doc = db.parse(xmlFile);

			NodeList mainDict = doc.getElementsByTagName("dict");

			for (int i = 0; i < mainDict.getLength(); i++) {
				Node node = mainDict.item(0);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element key = (Element) node;
					String mapKey = (key.getElementsByTagName("key").item(i).getTextContent());
					String mapValue = (key.getElementsByTagName("key").item(i).getNextSibling().getTextContent());
					if (mapKey.equals("Track ID")) {
						xmlData.put(mapKey, mapValue);
					} else if (mapKey.equals("Name")) {
						xmlData.put(mapKey, mapValue);
					} else if (mapKey.equals("Artist")) {
						xmlData.put(mapKey, mapValue);
					} else if (mapKey.equals("Album")) {
						xmlData.put(mapKey, mapValue);
					} else if (mapKey.equals("Genre")) {
						xmlData.put(mapKey, mapValue);
					} else if (mapKey.equals("Year")) {
						xmlData.put(mapKey, mapValue);
						Track track = new Track(xmlData.get("Track ID"),
										xmlData.get("Name"),
										xmlData.get("Artist"),
										xmlData.get("Album"),
										xmlData.get("Genre"),
										xmlData.get("Year"));
						if (track.getTrackId() != null || !track.getTrackId().equals(""))
							trackMap.put(xmlData.get("Track ID"), track);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}