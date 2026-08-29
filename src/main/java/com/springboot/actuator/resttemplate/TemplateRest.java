package com.springboot.actuator.resttemplate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class TemplateRest {

    @GetMapping(value = "/Rest/{id}")
    public ResponseEntity<String> getOrder(@PathVariable int id) {
        String url = "http://localhost:9090/order/" + id;
        try {
            URL obj=new URL(url);
            HttpURLConnection con=(HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept","application/json");
            BufferedReader rd=new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while(rd.readLine()!=null){
                sb.append(rd.readLine());
            }
            rd.close();
            System.out.println(sb.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok("done ok ok");
    }
}
