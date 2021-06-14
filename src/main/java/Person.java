import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private List<String> phoneNumbers;
    private Car car;

    public Person() {
    }

    public Person(String name, String surName, List<String> phoneNumbers, Car car) {
        this.firstName = name;
        this.lastName = surName;
        this.phoneNumbers = phoneNumbers;
        this.car = car;
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

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", car=" + car +
                '}';
    }
}