package me.axl.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Main {

    private static final int BIND_PORT = 9999;

    public static void main(String[] args) {

	Logger logger = LoggerFactory.getLogger(Main.class);
	logger.info("you better let me see the fucking log entry here!");

	SpringApplication.run(Main.class, args);
    }

    @Configuration
    public class ServletConfig {
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
	    return (container -> {
		container.setPort(BIND_PORT);
	    });
	}
    }

}