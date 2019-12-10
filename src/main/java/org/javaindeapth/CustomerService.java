package org.javaindeapth;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	List<Customer> list = new ArrayList<Customer>(Arrays.asList(
			new Customer(1, "John", 20),
			new Customer(2, "Michele", 23)
			));
	
	public Customer getCustomer(int id) {
		return list.stream().filter(c -> c.getId().equals(id)).findFirst().get();
	}
	
	public void deleteCustomer(int id) {
		list.removeIf(c -> c.getId().equals(id));
	}
	
	public void createCustomer(Customer customer) {
		list.add(customer);
	}
	
	public void  updateCustomer(Customer customer) {
		Customer cust = list.stream().filter(c -> c.getId().equals(customer.getId())).findFirst().get();
		list.remove(cust);
		list.add(customer);
	}
}
