package JavaTst.phoneBook;

import java.util.ArrayList;
import java.util.Comparator;

public class phoneBook {

    private final ArrayList<Contact> contacts;

    public phoneBook(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public phoneBook() {
        this.contacts = new ArrayList<>();
    }

    // add
    public void addContact(Contact contact) {
        if (!contacts.contains(contact))
            contacts.add(contact);
    }

    // replace
    public void replaceContact(Contact contact, Contact replacement) {
        int index = contacts.indexOf(contact);
        if (index == -1) return;
        contacts.remove(index);
        contacts.add(index, replacement);
    }

    // find by phone -> return contact | throw nullpexc
    public Contact findContact(String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone))
                return contact;
        }
        throw new NullPointerException("Contact not found");
    }

    // sort by first name
    public void sortByName() {
        Comparator<Contact> c = (o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
        contacts.sort(c);
    }

    // print
    public void printContacts() {
        contacts.forEach(System.out::println);
    }
}
