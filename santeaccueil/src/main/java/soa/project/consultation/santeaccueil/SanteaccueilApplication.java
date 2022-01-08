package soa.project.consultation.santeaccueil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SanteaccueilApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanteaccueilApplication.class, args);
	}
	// restTemplate pour faire l
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}


	
}
