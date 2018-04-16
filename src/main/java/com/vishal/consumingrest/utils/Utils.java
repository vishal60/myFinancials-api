package com.vishal.consumingrest.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import com.vishal.consumingrest.entities.AccountsList;

public class Utils {
	
	public static StringBuffer getPayloadfromHttp(String urlString, String httpBody) {

		StringBuffer sbPayload = new StringBuffer();

		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "text/xml");
			
			OutputStream os = conn.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");    
			osw.write(httpBody);
			
			osw.flush();
			osw.close();			
			os.flush();
			os.close();

			BufferedReader msg = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String currentLine = msg.readLine();
			while(currentLine != null){
				sbPayload.append(currentLine);
				currentLine = msg.readLine();
			}
			conn.disconnect();

		} catch (MalformedURLException e) {
			System.out.println("URL exception");
		} catch (IOException e) {
			System.out.println("http url opening error");
		}
		return sbPayload;
	}
	
	public static String removeAllSoapTags(StringBuffer sb) {
		JSONObject jsonObject = xml2json(sb);
		return XML.toString( ((JSONObject)((JSONObject)((JSONObject)((JSONObject)jsonObject.get("soapenv:Envelope")).get("soapenv:Body")))) );
	}
	
	public static JSONObject xml2json(StringBuffer sb) {
		JSONObject jsonObject = XML.toJSONObject(sb.toString());
		return jsonObject;
	}
	
	public static Object unMarshall(String xmlBody, Class<?> xsdClass) {
		
		Object obj = null;
		
		try {
			Unmarshaller unmarshaller = JAXBContext.newInstance(xsdClass).createUnmarshaller();
			obj = (Object)unmarshaller.unmarshal(new StringReader(xmlBody));
		} catch (JAXBException e) {e.printStackTrace();}
		return obj;
	}
	
	public static List<AccountsList> unMarshallAccounts(String xmlBody) {
		
		StringBuffer sb = new StringBuffer();
		sb.append(xmlBody);
		AccountsList tempAccList = null;
		List<AccountsList> accountsList= new ArrayList<AccountsList>();

		JSONObject jsonObject = xml2json(sb);
		JSONArray jsonArray = (JSONArray) ((JSONObject)jsonObject.get("accounts_list")).get("row");
		
		for(Object obj: jsonArray) {
			String accountNumber = ((JSONObject)obj).get("account_number").toString();
			String accountName = ((JSONObject)obj).get("account_name").toString();
			String outstandingBalance = ((JSONObject)obj).get("outstanding_balance").toString();
			
			tempAccList = new AccountsList();
			tempAccList.setAccountNumber(accountNumber);
			tempAccList.setAccountName(accountName);
			tempAccList.setOutstandingBalance(outstandingBalance);
			
			accountsList.add(tempAccList);
		}
		return accountsList;
		
	}
	
	public static JSONObject getInJsonObj(JSONObject jsonObj, String elementName) {
		return (JSONObject)((JSONObject)((JSONObject)((JSONObject)((JSONObject)jsonObj.get("soapenv:Envelope")).get("soapenv:Body")))).get(elementName);
	}
	
	public static JSONObject removeSoapTags(JSONObject jsonObj, Boolean removeEnvalope, Boolean removeBody) {
		if(removeEnvalope == true && removeBody == false) 
			return ((JSONObject)jsonObj.get("soapenv:Envelope"));
		else if(removeEnvalope == true && removeBody == true)
			return ((JSONObject)((JSONObject)((JSONObject)jsonObj.get("soapenv:Envelope")).get("soapenv:Body")));
		else
			return null;
	}
	
	public static String getIntElement(JSONObject jsonObj, String elementName) {
		jsonObj = removeSoapTags(jsonObj, true, true);
		return Integer.toString(jsonObj.getInt(elementName));
	}

	public static String getStringElement(JSONObject jsonObj, String elementName) {
		jsonObj = removeSoapTags(jsonObj, true, true);
		return (String) jsonObj.getString(elementName);
	}
	
	public static String jsonToXmlString(JSONObject inJsonObject) {
		return XML.toString(inJsonObject);
	}
	
}
