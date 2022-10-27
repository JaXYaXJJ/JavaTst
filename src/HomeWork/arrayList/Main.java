package HomeWork.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        PhoneBook phoneBook = new PhoneBook(contacts);

        phoneBook.addContact(new Contact("NameOne", "FamOne",
                "051", "AddressOne"));
        phoneBook.addContact(new Contact("NameTwo", "FamTwo",
                "052", "AddressTwo"));
        phoneBook.addContact(new Contact("NameThree", "FamThree",
                "053", "AddressThree"));

//        for (int i = 0; i < contacts.size(); i++) {
//            System.out.println(contacts.get(i).getFirstName() + " ");
//        }
//        phoneBook.addContact(contactThree);
//        for (int i = 0; i < phoneBook.contacts.size(); i++) {
//            System.out.println(phoneBook.contacts.get(i).getFirstName() + " ");
//        }
//        phoneBook.findContact();
//        phoneBook.printContacts();
    }
}
