public class Customer {
    private String name;
    private Address address;
    private String number;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return String.format("Hi! My name is %s and I live at %s", name, address);
    }
}
