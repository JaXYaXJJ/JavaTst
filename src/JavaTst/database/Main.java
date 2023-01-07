package JavaTst.database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        String command = "";
        UserRepository repository = new UserRepository();

        while (!"stop".equals(command)) {
            System.out.println("""
                    Enter an option:
                    #) saveUser
                    #) getUserByEmail
                    #) deleteUser
                    """);
            command = in.nextLine();

            if("saveUser".equals(command)) {
                System.out.println("Pls insert your mail");
                String email = in.nextLine();
                System.out.println("Pls insert your password");
                String pass = in.nextLine();

                User user = repository.saveUser(new User(email, pass));
                if(user != null) {
                    System.out.println(user.getEmail() + " saved successfully");
                }
            } else if ("getUserByEmail".equals(command)) {
                System.out.println("Enter email");
                String email = in.nextLine();
                User user = repository.getUserByEmail(email);
                if(user != null) {
                    System.out.println(user.getEmail() + " fetched successfully");
                    System.out.println("Leaked password: " + user.getPassword());
                }
            }
        }
    }
}
