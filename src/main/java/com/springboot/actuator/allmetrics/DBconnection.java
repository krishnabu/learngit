package com.springboot.actuator.allmetrics;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DBconnection implements HealthIndicator {

    @Override
    public Health health(){
        boolean check=checkDBConnection();
        return check? Health.up().withDetail("DB","Available").build():
                Health.down().down().withDetail("DB","Not Available").build();
    }
    public boolean checkDBConnection() {
        return true;
    }
}