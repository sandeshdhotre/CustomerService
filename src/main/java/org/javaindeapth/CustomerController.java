package org.javaindeapth;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable("id") Integer id) {
		return service.getCustomer(id);
	}
	
	@RequestMapping(path = "/customer/{id}", method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("id") Integer id) {
		service.deleteCustomer(id);
	}
	
	@RequestMapping(path = "/customer", method = RequestMethod.PUT)
	public void  updateCustomer(@RequestBody Customer customer) {
		service.updateCustomer(customer);
	}
	
	@RequestMapping(path = "/customer", method = RequestMethod.POST)
	public void createCustomer(@RequestBody Customer customer) {
		service.createCustomer(customer);
	}
}
