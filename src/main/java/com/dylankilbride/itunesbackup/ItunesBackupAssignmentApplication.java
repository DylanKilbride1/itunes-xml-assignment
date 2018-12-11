package com.dylankilbride.itunesbackup;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ItunesBackupAssignmentApplication extends SpringBootServletInitializer {

	private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ItunesBackupAssignmentApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ItunesBackupAssignmentApplication.class, args);
	}
}
