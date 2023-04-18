import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {


        Scanner keyboard = new Scanner(System.in);


        /*1.Message to user
         *2. Prompting user to input email
         */

        System.out.println("Hello User Let us log you in" + "\n"+"\n"+
                "Please input your email address" );

        //Accepting user input
        String email  =  keyboard.nextLine();

        //Prompting user for input
        System.out.println("Please input your phone number" );
        //Accepting user input
        int phone  =  keyboard.nextInt();


        // calling User Object
        new User(email, phone);

    }
}

class User {
    // Declaring encapsulated variables Constructor

    private String email;
    private int phone;
    public User(String email, int phoneNumber){


        // init encapsulated variables
        this.email = email;
        this.phone = phoneNumber;

        // printing user input with message
        System.out.println("Welcome back to desktop " +"User \n Email address - \t"
                + this.email +"\n \n ENJOY YOUR SESSION");

    }

}