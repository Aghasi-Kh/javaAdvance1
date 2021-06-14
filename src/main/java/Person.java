import java.util.List;

public class Person {

    private String name;
    private String surName;
    private List<String> phoneNumbers;
    private Car car;

    public Person() {
    }

    public Person(String name, String surName, List<String> phoneNumbers, Car car) {
        this.name = name;
        this.surName = surName;
        this.phoneNumbers = phoneNumbers;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", PhoneNumbers=" + phoneNumbers +
                ", car=" + car +
                '}';
    }
}