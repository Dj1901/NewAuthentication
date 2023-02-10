package com.example.demo;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
     private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public Response getToken(Request request)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Gson gson = new Gson();
        HttpEntity<String> Request = new HttpEntity<>(gson.toJson(request),headers);
        ResponseEntity<Response> s = restTemplate.postForEntity("https://coreuat-zwqcqy3qmq-el.a.run.app/getlogintoken",request,Response.class);
        //System.out.println(s.getBody());
        return s.getBody();
    }
}
