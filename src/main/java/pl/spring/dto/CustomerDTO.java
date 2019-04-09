package pl.spring.dto;

import java.util.Date;
import java.util.Objects;

public class CustomerDTO {

    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private Date visitDate;
    private Date visitTime;
    private String assignedHairdresser;
    private String additionalInfo;
    private String comments;

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

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
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
        CustomerDTO that = (CustomerDTO) o;
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
        return "CustomerDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", visitDate=" + visitDate +
                ", visitTime=" + visitTime +
                ", assignedHairdresser='" + assignedHairdresser + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}