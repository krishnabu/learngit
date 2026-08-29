package com.springboot.actuator.dependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "onlineorder",value = "enable",havingValue = "true",matchIfMissing = false)
public class OnlineOrder implements Order{

    public String order(){
        return "OnlineOrder";
    }
}
