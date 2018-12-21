package com.codygordon.firebasejava;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestHelper {

	private HttpClient client;
	private String baseUrl;
	
	public RestHelper() {
		initClient();
	}
	
	public RestHelper(String baseUrl) {
		initClient();
		setBaseUrl(baseUrl);
	}
	
	private void initClient() {
		client = HttpClients.createDefault();	
	}
	
	public HttpClient getClient() {
		return this.client;
	}
	
	public String getBaseUrl() {
		return this.baseUrl;
	}
	
	public void setBaseUrl(String url) {
		this.baseUrl = url;
	}
}