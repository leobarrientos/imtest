package com.imagemaker.demo;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static final Log LOG = LogFactory.getLog(TestController.class);
    
	
	
	 @GetMapping("/listHeaders")
	    public ResponseEntity<String> listAllHeaders(@RequestHeader Map<String, String> mapHeaders, @RequestHeader HttpHeaders headers) {

		 LOG.info(headers.getConnection());
		 
	        mapHeaders.forEach((key, value) -> {
	            LOG.info(String.format("Header '%s' = %s", key, value));
	        });

	        return new ResponseEntity<String>(String.format("Listed %d headers", mapHeaders.size()), HttpStatus.OK);
	    }
	
}
