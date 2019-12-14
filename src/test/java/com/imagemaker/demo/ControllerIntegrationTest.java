package com.imagemaker.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.imagemaker.demo.entity.Customer;
import com.imagemaker.demo.entity.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerIntegrationTest {

//	@Autowired
//    private MockMvc mockMvc;
 
    @MockBean
    private CustomerRepository service;
 
 
    @Autowired
    private TestRestTemplate restTemplate;
 
    @Test
    public void dadoIdClienteExistenteEntoncesDevuelvePerfilCliente() {
        // Given
    	Customer customer = new Customer("xxx", "yyyy");
        doReturn(customer).when(service).findById(1);
 
       	// When
        ResponseEntity<Customer> result = restTemplate.getForEntity("/customer/{id}", Customer.class, 1);

        // Then
        assertThat(result.getStatusCode(), is(HttpStatus.OK));
        Customer customerResult = result.getBody();
        assertThat(customerResult.getFirstName(), is("xxx"));

    }

}
