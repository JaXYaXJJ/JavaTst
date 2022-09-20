public class Main {
    public static void main(String[] args) {

        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.color = "White";
        halogen.color = "Yellow";

        led.turnLightOn();

        led.printLightStauts();
        halogen.printLightStauts();

    }
}

//import com.sun.org.apache.xpath.internal.objects.XString;

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        String [] drinks = {"cola", "fanta", "water", "sprite"};
//
//        int userSelection = 0;
//
//        while (userSelection != -1) {
//
//            displayMenu();
//            userSelection = sc.nextInt();
//
//            if (0 < userSelection && userSelection < 5)
//                System.out.println("Your selection : " + drinks[--userSelection]);
//            else
//                System.out.println("Wrong selection, pls try again...\n");
//        }
//
//        System.out.println("Thank U, have a nice day!");

//        String a = "Let it be, let it be, let it be, yeah, let it be\n";
//        String b = "Oh, there will be an answer, let it be\n";
//
//        System.out.println(a + b + a + b);

//        Scanner input = new Scanner(System.in);

//        String age = "My age is " + input.next();
//        System.out.println(age);

//        String firstName;
//        String lastName;
//        String emailAddress;
//
//        System.out.println("Pls enter your first name: ");
//        firstName = input.next();
//
//        System.out.println("Pls enter your last name: ");
//        lastName = input.next();
//
//        System.out.println("Pls enter your email address: ");
//        emailAddress = input.next();

//    }

//    public static void displayMenu() {
//
//        System.out.println("Hello, pls select one of the drinks below 1-4 :");
//        System.out.println("1. Cola");
//        System.out.println("2. Fanta");
//        System.out.println("3. Water");
//        System.out.println("4. Sprite");
//    }
//
//}




