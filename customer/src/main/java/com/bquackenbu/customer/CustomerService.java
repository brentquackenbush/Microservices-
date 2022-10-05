package com.bquackenbu.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().
                firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //to do: check if email valid
        //to do: check if email not taken
        customerRepository.save(customer);
    }
}
