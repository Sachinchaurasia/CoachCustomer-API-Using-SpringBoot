package com.example;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

	private final CoachRepository coachRepository;
	private final CustomerRepository customerRepository;
	public CustomerService(CoachRepository coachRepository, CustomerRepository customerRepository) {
		super();
		this.coachRepository = coachRepository;
		this.customerRepository = customerRepository;
	}
	
	public Customer createCustomer(Customer customer,Long coachId) {
		Coach coach=coachRepository.findById(coachId)
		        .orElseThrow(() -> new RuntimeException("Coach not found"));

		return customerRepository.save(customer); 
	}
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	public  Optional<Customer> getCustomerById(Long id){
		return customerRepository.findById(id);
	}

	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
