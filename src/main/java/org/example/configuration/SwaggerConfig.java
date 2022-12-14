package org.example.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI demoApi(@Value("REST API for challenge chapter 6 back end java binar academy") String appDescription,
                           @Value("v1.0.0") String appVersion
    ) {
        Server server = new Server();
        server.setUrl("https://microserviceseatchallenge7-production.up.railway.app/");
        List<Server> listOfServer = new ArrayList<>();
        listOfServer.add(server);

        return new OpenAPI()
                .info(new Info()
                        .title("Patra API")
                        .version(appVersion)
                        .description(appDescription)
                        .termsOfService("http://swagger.io/terms")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")
                        )
                )
                .servers(listOfServer);
    }
}
