package com.infobank.chatbot;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ContainerConfig.java
 * @author leesw
 * @date 2018. 3. 22.
 * spring boot tomcat ajp setting
 */
@Configuration
public class ContainerConfig {
	
	@Value("${tomcat.ajp.protocol}")
	String ajpProtocol;

	@Value("${tomcat.ajp.port}")
	int ajpPort;
	
	@Bean
	public WebServerFactoryCustomizer<TomcatServletWebServerFactory> containerCustomizer() {
		return server -> {
			if (server instanceof TomcatServletWebServerFactory) {
				((TomcatServletWebServerFactory) server).addAdditionalTomcatConnectors(redirectConnector());
			}
		};
	}
	
	private Connector redirectConnector() {
		Connector connector = new Connector(ajpProtocol);
		connector.setScheme("http");
		connector.setPort(ajpPort);
		connector.setSecure(false);
		connector.setAllowTrace(false);
		return connector;
	}
}
