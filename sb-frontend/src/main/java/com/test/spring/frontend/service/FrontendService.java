package com.test.spring.frontend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spring.backend.service.BackendService;
import com.test.spring.frontend.model.TutorialModel;

@Service
public class FrontendService {

    private Logger LOG = LoggerFactory.getLogger(FrontendService.class);

    @Autowired
    public BackendService backendService;

    public String addTutorial(TutorialModel model){
        LOG.info("addTutorial");
        return backendService.callBackend(model
            , "create");
    }
}
