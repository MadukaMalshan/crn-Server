package edu.icet.controller;

import edu.icet.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/name")
    public String getName() {
        return "Maduka";
    }

    @GetMapping("/age")
    public Integer getAge() {
        return 22;
    }


    @GetMapping("/get-customer")
    public Customer getCustomer(){
        return new Customer(
                "C001",
                "Maduka",
                "Galle",
                25000.00
        );
    }
}