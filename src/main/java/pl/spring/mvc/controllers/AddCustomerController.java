package pl.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.spring.core.services.CustomerService;
import pl.spring.dto.AddCustomerDTO;


@Controller
@RequestMapping("/add_customer")
public class AddCustomerController {

    private CustomerService customerService;

    @Autowired
    public AddCustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getAddCustomerPage() {
        return "add_customer";
    }

    @PostMapping
    public String addCustomer(AddCustomerDTO customerDTO) {
        customerService.addCustomer(customerDTO);
        return "redirect:/added_customer";
    }
}