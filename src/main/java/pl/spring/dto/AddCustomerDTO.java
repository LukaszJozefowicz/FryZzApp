package pl.spring.dto;

import java.util.Date;
import java.util.Objects;

public class AddCustomerDTO {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    private Date visitDate;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddCustomerDTO that = (AddCustomerDTO) o;
        return firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                telephoneNumber.equals(that.telephoneNumber) &&
                visitDate.equals(that.visitDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, telephoneNumber, visitDate);
    }

    @Override
    public String toString() {
        return "AddCustomerDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", visitDate='" + visitDate + '\'' +
                '}';
    }
}
