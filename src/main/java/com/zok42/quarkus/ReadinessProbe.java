package com.zok42.quarkus;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class ReadinessProbe implements HealthCheck{

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.builder()
            .name("database")
            .withData("connections", "10") 
            .up()
            .build();
    }

}