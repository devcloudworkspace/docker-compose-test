package com.test.spring.frontend.controller;


import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.frontend.model.TutorialModel;
import com.test.spring.frontend.service.FrontendService;


// @CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class FrontendController {

	private Logger LOG = LoggerFactory.getLogger(FrontendController.class);

	@Autowired
	private FrontendService frontendService; 

	@PostMapping("/frontend/create")
	public ResponseEntity<String> createTutorial(@RequestBody TutorialModel tutorial) {
		LOG.info("inside 'createTutorial'");
		try {
			// TutorialModel _tutorial = tutorialRepository
			// 		.save(new TutorialModel(tutorial.getTitle(), tutorial.getDescription(), false));
			// return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
			frontendService.addTutorial(tutorial);
			return new ResponseEntity<>("OK", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
