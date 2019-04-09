package pl.spring.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.spring.data.model.Customer;
import pl.spring.data.repositories.CustomerRepository;
import pl.spring.dto.AddCustomerDTO;
import pl.spring.dto.CustomerDTO;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public Customer addCustomer (AddCustomerDTO customerDTO) {
        Customer customer = convertFromDTO(customerDTO);
        return customerRepository.save(customer);
    }

    private Customer convertFromDTO(AddCustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName((customerDTO.getLastName()));
        customer.setTelephoneNumber(customerDTO.getTelephoneNumber());
        customer.setVisitDate(customerDTO.getVisitDate());
        return customer;
    }

    public List<CustomerDTO> getAllCustomers(){
        List<CustomerDTO> allCustomers = new LinkedList<>();
        for (Customer customer : customerRepository.findAll()){
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setFirstName(customer.getFirstName());
            customerDTO.setLastName(customer.getLastName());
            customerDTO.setTelephoneNumber(customer.getTelephoneNumber());
            customerDTO.setVisitDate(customer.getVisitDate());
            customerDTO.setVisitTime(customer.getVisitTime());
            customerDTO.setAssignedHairdresser(customer.getAssignedHairdresser());
            customerDTO.setAdditionalInfo(customer.getInfo());
            customerDTO.setComments(customer.getComments());
            allCustomers.add(customerDTO);
        }
        return allCustomers;
    }

    public List<CustomerDTO> getArrangedCustomers(){
        List<CustomerDTO> arrangedCustomers = new LinkedList<>();
        for (Customer customer : customerRepository.findByVisitDateNotNull()){
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setFirstName(customer.getFirstName());
            customerDTO.setLastName(customer.getLastName());
            customerDTO.setTelephoneNumber(customer.getTelephoneNumber());
            customerDTO.setVisitDate(customer.getVisitDate());
            customerDTO.setVisitTime(customer.getVisitTime());
            customerDTO.setAssignedHairdresser(customer.getAssignedHairdresser());
            customerDTO.setAdditionalInfo(customer.getInfo());
            customerDTO.setComments(customer.getComments());
            arrangedCustomers.add(customerDTO);
        }
        return arrangedCustomers;
    }

    public List<CustomerDTO> getNotArrangedCustomers(){
        List<CustomerDTO> notArrangedCustomers = new LinkedList<>();
        for (Customer customer : customerRepository.findByVisitDateIsNull()){
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setFirstName(customer.getFirstName());
            customerDTO.setLastName(customer.getLastName());
            customerDTO.setTelephoneNumber(customer.getTelephoneNumber());

            notArrangedCustomers.add(customerDTO);
        }
        return notArrangedCustomers;
    }
}
