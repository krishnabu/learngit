package com.springboot.actuator.profiles;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBconnections {

    @Value("${user}")
    public String username;
    @Value("${password}")
    public String password;

    @PostConstruct
    public void init(){
        System.out.println(username+"-"+password);
    }

}
