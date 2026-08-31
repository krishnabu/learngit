package com.springboot.actuator.dependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "offlineorder",value = "enable",havingValue = "true",matchIfMissing = false)
public class OfflineOrder implements Order{
    public String order(){
        return "OfflineOrderokoksriram";
    }
}
