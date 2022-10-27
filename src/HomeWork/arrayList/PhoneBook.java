package HomeWork.arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PhoneBook {

    ArrayList<Contact> contacts;

    PhoneBook(ArrayList<Contact> contacts) {

        this.contacts = contacts;
    }

    public void addContact(Contact contact) {

//        if (contacts.contains(contact)) {
//            System.out.println("Object exist");
//            return;
//        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber() == contact.getPhoneNumber()) {
                System.out.println("Name exist");
                return;
            }
        }

        contacts.add(contact);
        System.out.println("Contact " + contact.getFirstName() + " "
                + contact.getLastName() + " added");
    }

    public void updateContact() {}

    public void findContact() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter phone number: ");

        String contactPhone = sc.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contactPhone.equals(contacts.get(i).getPhoneNumber())) {
                System.out.println("BINGO! " + contacts.get(i).getFirstName()
                        + contacts.get(i).getPhoneNumber());
                return;
            }
        }
    }

    public void sortContact() {

        contacts.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                System.out.println(contacts);
                return 0;
            }
        });
    }

    public void printContacts() {

        contacts.forEach(contact -> System.out.println("Name: " + contact.getFirstName() +
                "\nPhone Number: " + contact.getPhoneNumber()));
    }
}