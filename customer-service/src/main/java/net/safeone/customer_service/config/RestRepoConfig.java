package net.safeone.customer_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestRepoConfig implements RepositoryRestConfigurer {

    public void configureRepositoryRestConfiguration(org.springframework.data.rest.core.config.RepositoryRestConfiguration config) {
        config.exposeIdsFor(net.safeone.customer_service.entities.Customer.class);
    }
}
