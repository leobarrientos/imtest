package com.imagemaker.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imagemaker.demo.entity.Customer;
import com.imagemaker.demo.entity.repository.CustomerRepository;

@RestController
public class TestController {

	private static final Log LOG = LogFactory.getLog(TestController.class);

	@Autowired
	private CustomerRepository customerRepository;


	@GetMapping("/customer/{id}")
	@ResponseBody
	public ResponseEntity<?> getCustomerById(@PathVariable("id") Long id) {
		try {
			LOG.info("Id: " + id);

			Customer customer = customerRepository.findById(id.longValue());
			if (customer != null) {
				return new ResponseEntity<Customer>(customer , HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("Id No existe" , HttpStatus.BAD_REQUEST);
					
			}
		} catch (Exception e) {
			LOG.info("Request processing failed");
			return new ResponseEntity<String>("INTERNAL_SERVER_ERROR occurred "+ e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
