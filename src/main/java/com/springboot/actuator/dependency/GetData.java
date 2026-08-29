package com.springboot.actuator.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetData {
//    @Qualifier("OfflineOrderAdd")
//    Order offlineorder;
//
//    @Autowired
//    @Qualifier("OnlineOrderAdd")
//    Order onlineorder;
    @Autowired
    Order order;

    @GetMapping(value = "/order")
    public ResponseEntity<String> getOrder(@Value("${offlineorder.enable}") boolean id) {
        return id ? ResponseEntity.ok(order.order()) : ResponseEntity.ok(order.order());
    }
}
