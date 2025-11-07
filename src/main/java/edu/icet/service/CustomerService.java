package edu.icet.service;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer getCustomerById(String id);
    List<Customer> getAllCustomers();
    Customer updateCustomer(String id, Customer customer);
    void deleteCustomer(String id);
}
