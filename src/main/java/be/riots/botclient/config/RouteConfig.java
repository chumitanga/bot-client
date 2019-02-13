package be.riots.botclient.config;

import be.riots.botclient.model.Route;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RouteConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Route mountain = restTemplate.getForObject(
                    "http://localhost:8080/route", Route.class);
            System.out.println(mountain);
        };
    }
}
