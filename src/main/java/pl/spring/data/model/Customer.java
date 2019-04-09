package pl.spring.data.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(unique = true, nullable = false, name = "last_name")
    private String lastName;

    @Column(unique = true, nullable = false, name = "telephone_Number")
    private String telephoneNumber;

    @Column(name = "visit_date")
    @Temporal(TemporalType.DATE)
    private Date visitDate;

    @Column(name = "visit_time")
    @Temporal(TemporalType.TIME)
    private Date visitTime;

    @Column(name = "assigned_hairdresser")
    private String assignedHairdresser;

    @Column(name = "additional_info")
    private String additionalInfo;

    @Column(name = "comments")
    private String comments;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getAssignedHairdresser() {
        return assignedHairdresser;
    }

    public void setAssignedHairdresser(String assignedHairdresser) {
        this.assignedHairdresser = assignedHairdresser;
    }

    public String getInfo() {
        return additionalInfo;
    }

    public void setInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", visitTime='" + visitTime + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';

    }
}

