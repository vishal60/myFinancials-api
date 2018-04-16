package com.vishal.consumingrest.resources;

public class HttpRequestBody {
	
	public static final String getAccountInfoEndPoint(String account_id, String address_id, String email, String parent_party_id) {
		return "<?xml version='1.0' encoding='utf-8'?>"+
		"<SOAP-ENV:Envelope xmlns:SOAP-ENV='http://schemas.xmlsoap.org/soap/envelope/'>"+
		"<SOAP-ENV:Body>" +
		"	<request_parameters>" +
		"		<account_id>" + account_id + "</account_id>" +
		"		<address_id>" + address_id + "</address_id>" +
		"		<email>" + email + "</email>" +
		"		<parent_party_id>" + parent_party_id + "</parent_party_id>" +
		"		<outstanding_criteria>1</outstanding_criteria>" +
		"	</request_parameters></SOAP-ENV:Body>" +
		"</SOAP-ENV:Envelope>";
	}

	public static final String getAccountsEndPoint(String userName) {
		return "<?xml version='1.0' encoding='utf-8'?>"+
		"<SOAP-ENV:Envelope xmlns:SOAP-ENV='http://schemas.xmlsoap.org/soap/envelope/'>"+
		"<SOAP-ENV:Body>" +
		"	<request_parameters>" +
		"		<email>" + userName + "</email>" +
		"		<outstanding_criteria>1</outstanding_criteria>" +
		"	</request_parameters></SOAP-ENV:Body>" +
		"</SOAP-ENV:Envelope>";
	}
	
	public static final String getInvListEndPoint(String account_id, String address_id, String transaction_type, String transaction_status, String search_type,
							String search_key,String order_by,String order_direction,String page_num,String rows_per_page,String filter_limit,String email,
							String trx_number) {
		return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <SOAP-ENV:Body>\r\n" + 
				"    <request_parameters>\r\n" + 
				"      <account_id>" + account_id + "</account_id>\r\n" + 
				"      <address_id>" + address_id + "</address_id>\r\n" + 
				"      <transaction_type />\r\n" + 
				"      <transaction_status>" + transaction_status + "</transaction_status>\r\n" + 
				"      <search_type>" + search_type + "</search_type>\r\n" + 
				"      <search_key />\r\n" + 
				"      <order_by>" + order_by + "</order_by>\r\n" + 
				"      <order_direction>" + order_direction + "</order_direction>\r\n" + 
				"      <page_num>" + page_num + "</page_num>\r\n" + 
				"      <rows_per_page>" + rows_per_page + "</rows_per_page>\r\n" + 
				"      <filter_limit />\r\n" + 
				"      <email>" + email + "</email>\r\n" + 
				"      <trx_number />\r\n" + 
				"    </request_parameters>\r\n" + 
				"  </SOAP-ENV:Body>\r\n" + 
				"</SOAP-ENV:Envelope> ";
	}

	public static String getSalesOrderListEndPoint(String account_id, String address_id, String trx_number) {
		return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <SOAP-ENV:Body>\r\n" + 
				"    <request_parameters>\r\n" + 
				"      <account_id>" + account_id + "</account_id>\r\n" + 
				"      <address_id>" + address_id + "</address_id>\r\n" + 
				"      <email />\r\n" + 
				"      <trx_number>" + trx_number + "</trx_number>\r\n" + 
				"    </request_parameters>\r\n" + 
				"  </SOAP-ENV:Body>\r\n" + 
				"</SOAP-ENV:Envelope>";
	}
	
}
