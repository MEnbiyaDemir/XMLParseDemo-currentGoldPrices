package src;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			
	        
	        DocumentBuilder builderAl = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			URL urlAl= new URL("http://www.kulcealtin.com/altinxml/");
	        Document documentAl=builderAl.parse(urlAl.openStream());
	        NodeList nodelistAl=documentAl.getElementsByTagName("altin");
	       
	           ArrayList<String> nameAl=new ArrayList();
	           ArrayList<String> goldBuy=new ArrayList();
	           ArrayList<String> goldSell=new ArrayList();
        
	      
	        	NodeList listAl=documentAl.getElementsByTagName("altin");

	        	for(int i=0;i<listAl.getLength();i++){
	        		
	        		Node nAl =listAl.item(i);
	        		Element eAl=(Element)nAl;

	        		nameAl.add(eAl.getElementsByTagName("adi").item(0).getTextContent());
	        		goldBuy.add(eAl.getElementsByTagName("al").item(0).getTextContent());
	        		goldSell.add(eAl.getElementsByTagName("sat").item(0).getTextContent());
	        		System.out.println("Ýsim:"+nameAl.get(i));
	        		System.out.println("Satýþ: "+ goldSell.get(i));
	        		System.out.println("Alýþ: " +goldBuy.get(i));
	        		System.out.println("--------------------");
	        	}
 
	        
		}
		catch (IOException | ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{}
		
		
	}

}
