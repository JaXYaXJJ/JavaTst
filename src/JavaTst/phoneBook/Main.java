package JavaTst.phoneBook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        phoneBook phoneBook = new phoneBook(contacts);

        phoneBook.addContact(new Contact());

        System.out.println(contacts);


    }
}
