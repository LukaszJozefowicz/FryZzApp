package pl.spring.data.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.spring.data.model.Customer;
import java.util.List;


@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer getCustomerByAssignedHairdresser(String assignedHairdresser);

    List<Customer> findByVisitDateNotNull();
    List<Customer> findByVisitDateIsNull();

//    @Query(nativeQuery = true,
//            value = "insert into customers (first_name, last_name, telephone_number) values (:firstName, :lastName, :telephoneNumber)")
//    void addCustomer(@Param("firstName") String firstName, @Param("lastName") String LastName,
//                                @Param("telephoneNumber") String telephoneNumber);


}
