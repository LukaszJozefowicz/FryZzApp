package pl.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.spring.core.services.CustomerService;
import pl.spring.dto.CustomerDTO;

import java.util.List;

@Controller
@RequestMapping
public class DisplayCustomersController {

    private CustomerService customerService;

    @Autowired
    public DisplayCustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/display_customers")
    public String displayAllCustomers(Model model){
        List<CustomerDTO> customers = customerService.getAllCustomers();
        model.addAttribute("customersList", customers);
        return "customers";
    }

    @GetMapping("/arranged")
    public String displayOnlyArrangedCustomers(Model model){
        List<CustomerDTO> customers = customerService.getArrangedCustomers();
        model.addAttribute("customersList", customers);
        return "arranged_customers";
    }

    @GetMapping("/not_arranged")
    public String displayOnlyNotArrangedCustomers(Model model){
        List<CustomerDTO> customers = customerService.getNotArrangedCustomers();
        model.addAttribute("customersList", customers);
        return "not_arranged_customers";
    }
}
