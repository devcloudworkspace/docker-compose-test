package com.test.spring.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.spring.frontend.model.TutorialModel;

@Service
public class BackendService {

    private Logger LOG = LoggerFactory.getLogger(BackendService.class);

    @Value(value = "${backendBaseURL}")
    private String backendBaseURL;

    private final RestTemplate restTemplate;

    public BackendService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String someRestCall(TutorialModel model, String action) {
        LOG.info("backendBaseURL:{}, action:{}",backendBaseURL,action);
        ResponseEntity<String> response = this.restTemplate.postForEntity(backendBaseURL+"/"+action, model, String.class);
        LOG.info("response:{}",response);
        
        return response.toString();
    }

    public String callBackend(TutorialModel model, String action) {

        return someRestCall(model,action);
    }

}
