package com.cpd.hotel_system.gateway_service_api.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes()
                .route("Hotel-Management-service-Api",
                        r->r.path("/hotel-management/**").uri("http://localhost:8081") )
                .build();

    }
}
