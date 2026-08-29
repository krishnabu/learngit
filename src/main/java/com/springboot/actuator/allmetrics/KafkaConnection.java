package com.springboot.actuator.allmetrics;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class KafkaConnection implements HealthIndicator {

    @Override
    public Health health(){
        boolean check=checkDBConnection();
        return check? Health.up().withDetail("kafka","Available").build():
                Health.down().down().withDetail("kafka","Not Available").build();
    }
    public boolean checkDBConnection() {
        return false;
    }
}