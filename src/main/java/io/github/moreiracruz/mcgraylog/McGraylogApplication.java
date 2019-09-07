package io.github.moreiracruz.mcgraylog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McGraylogApplication {

	public static void main(String[] args) {
		SpringApplication.run(McGraylogApplication.class, args);
	}

	@Bean
	public HandlerExceptionResolver sentryExceptionResolver() {
		return new io.sentry.spring.SentryExceptionResolver();
	}

}
