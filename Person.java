public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    // Constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = address;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
    
}
