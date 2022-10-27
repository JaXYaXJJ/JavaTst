package ClassWork.aviPhoneBook;

public class Contact {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    Contact(String name, String surname, String phone, String address) {
        this.firstName = name;
        this.lastName = surname;
        this.phoneNumber = phone;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return this.firstName + this.lastName + this.phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {

        boolean isEqual = false;

        if (obj instanceof Contact) {

            isEqual = ((Contact)obj).phoneNumber == this.phoneNumber;
        }
        return isEqual;
    }
}


