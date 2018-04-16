package com.vishal.consumingrest.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.consumingrest.entities.AccountsList;
import com.vishal.consumingrest.entities.xsdclasses.AccountSiteSummary;
import com.vishal.consumingrest.entities.xsdclasses.InvList;
import com.vishal.consumingrest.entities.xsdclasses.Row;
import com.vishal.consumingrest.entities.xsdclasses.SalesDetails;
import com.vishal.consumingrest.resources.Endpoints;
import com.vishal.consumingrest.resources.HttpRequestBody;
import com.vishal.consumingrest.utils.Utils;

@RestController
public class MyFinancialsApiRestContoller {

	
	private String endpointUri = null;
    
    @RequestMapping("/premier_accounts/getaccounts")
    public List<AccountsList> xml2Json(@RequestParam(value="user_name") String user_name) {

    	endpointUri = Endpoints.ACCOUNTS_ENDPOINT;
    	
       	String httpBody = HttpRequestBody.getAccountsEndPoint(user_name).trim();
   		String xmlBody = Utils.removeAllSoapTags(Utils.getPayloadfromHttp(endpointUri, httpBody));
   		List<AccountsList> accounts = Utils.unMarshallAccounts(xmlBody);

   		return accounts;
	}
    
	@RequestMapping("/premier_accounts/getaccount")
    public Row xml2Json(@RequestParam(value="user_name") String user_name, 
    					@RequestParam(value="account_number") String account_number) {

		endpointUri = Endpoints.ACCOUNTS_ENDPOINT;
		
    	String httpBody = HttpRequestBody.getAccountsEndPoint(user_name).trim();
		String xmlBody = Utils.removeAllSoapTags(Utils.getPayloadfromHttp(endpointUri, httpBody));
		
		JSONObject jsonObject = Utils.xml2json(new StringBuffer().append(xmlBody));
		JSONArray jsonArray = (JSONArray) ((JSONObject)jsonObject.get("accounts_list")).get("row");
		
		for(Object obj: jsonArray){
			Object accountNumber = ((JSONObject)obj).get("account_number");
			if(accountNumber.toString().equalsIgnoreCase(account_number)) 			
				return (Row) Utils.unMarshall("<row>" + XML.toString((JSONObject)obj) + "</row>", Row.class);
		}
		return null;
	}
	
	@RequestMapping("/premier_accounts/getaccsummary")
    public AccountSiteSummary xml2Json(@RequestParam(value="account_id") String account_id,
							    	   @RequestParam(value="address_id") String address_id,
							    	   @RequestParam(value="email") String email,
							    	   @RequestParam(value="parent_party_id") String parent_party_id) {
    			endpointUri = Endpoints.ACCOUNT_INFO_ENDPOINT;
		
    	String httpBody = HttpRequestBody.getAccountInfoEndPoint(account_id, address_id, email, parent_party_id).trim();
		String xmlBody = Utils.removeAllSoapTags(Utils.getPayloadfromHttp(endpointUri, httpBody));
		AccountSiteSummary accountSiteSummary = (AccountSiteSummary) Utils.unMarshall(xmlBody, AccountSiteSummary.class);

		return accountSiteSummary;
    }
	
	@RequestMapping("/premier_accounts/getinvlist")
    public InvList xml2Json(@RequestParam(value="account_id") String account_id,
							@RequestParam(value="address_id") String address_id,
							@RequestParam(value="transaction_type") String transaction_type,
							@RequestParam(value="transaction_status") String transaction_status,
							@RequestParam(value="search_type") String search_type,
							@RequestParam(value="search_key") String search_key,
							@RequestParam(value="order_by") String order_by,
							@RequestParam(value="order_direction") String order_direction,
							@RequestParam(value="page_num") String page_num,
							@RequestParam(value="rows_per_page") String rows_per_page,
							@RequestParam(value="filter_limit") String filter_limit,
							@RequestParam(value="email") String email,
							@RequestParam(value="trx_number") String trx_number) {
    	
		endpointUri = Endpoints.INV_LIST_END_POINT;
		
    	String httpBody = HttpRequestBody.getInvListEndPoint(account_id, address_id, transaction_type, transaction_status, 
    							search_type, search_key, order_by, order_direction, page_num, rows_per_page, filter_limit, email, trx_number).trim();
    	
    	StringBuffer sb = Utils.getPayloadfromHttp(endpointUri, httpBody);
    	
    	JSONObject jsonObject = Utils.xml2json(sb);
    	
    	jsonObject = Utils.removeSoapTags(jsonObject, true, true);
    	System.out.println(jsonObject);
    	
    	String invListXmlString = "<invoice_list>" + Utils.jsonToXmlString(jsonObject) + "</invoice_list>";
    	System.out.println(invListXmlString);
    	
    	InvList invList = (InvList) Utils.unMarshall(invListXmlString, InvList.class);
    	
    	return invList;
    }
	
	@RequestMapping("/premier_accounts/getsalesorddetails")
    public SalesDetails xml2Json1(@RequestParam(value="account_id") String account_id,
    		@RequestParam(value="address_id") String address_id,
    		@RequestParam(value="email") String email,
    		@RequestParam(value="trx_number") String trx_number){
    	
		endpointUri = Endpoints.SALES_ORDER_LIST_ENDPOINT;
		
    	String httpBody = HttpRequestBody.getSalesOrderListEndPoint(account_id, address_id, trx_number).trim();
    	
       	StringBuffer sb = Utils.getPayloadfromHttp(endpointUri, httpBody);
        
    	JSONObject jsonObject = Utils.xml2json(sb);

    	jsonObject = Utils.getInJsonObj(jsonObject, "sales_details");

    	String invListXmlString = "<sales_details>" + Utils.jsonToXmlString(jsonObject) + "</sales_details>";
    	System.out.println(invListXmlString);
    	
    	SalesDetails salesDetails = (SalesDetails) Utils.unMarshall(invListXmlString, SalesDetails.class);
    	
    	return salesDetails;
    }
	
	private Object convertion() {
		
		return null;
	}
	
}
