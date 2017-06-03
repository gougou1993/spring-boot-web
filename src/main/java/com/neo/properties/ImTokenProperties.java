package com.neo.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component  
@ConfigurationProperties(prefix = "imToken")  
@PropertySource("classpath:imToken.properties") 
public class ImTokenProperties {

	private String appName;
	private String appServer;
	private String clientId;
	private String clientPassword;
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppServer() {
		return appServer;
	}
	public void setAppServer(String appServer) {
		this.appServer = appServer;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientPassword() {
		return clientPassword;
	}
	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}
	@Override
	public String toString() {
		return "ImTokenProperties [appName=" + appName + ", appServer=" + appServer + ", clientId=" + clientId
				+ ", clientPassword=" + clientPassword + "]";
	}
	
	
}
