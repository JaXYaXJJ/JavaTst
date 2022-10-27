package JavaTst.phoneBook;

public class Contact {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String firstName, String lastName, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public Contact() {
        this.firstName = IO.getString("Enter first name");
        this.lastName = IO.getString("Enter last name");
        this.phone = IO.getString("Enter phone number");
        this.address = IO.getString("Enter address");
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override
    public String toString() {

        return "Name: " + this.firstName +
                "\nPhone Number: " + this.phone;
    }
}