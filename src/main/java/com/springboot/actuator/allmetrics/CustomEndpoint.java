package com.springboot.actuator.allmetrics;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="shiva")
public class CustomEndpoint {
    @ReadOperation
    public String send(){
        return "Hello World";
    }
}
