import java.util.Scanner;

/**
 * Getting input from user and set that input in the constructor
 * @author Chaitra NS
 * @since 21 Jun 2021
 * @version 2.0
 */

public class AddressSystem {
    public static void main(String[] args) {        
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name : " );
        String firstName = sc.next();
        System.out.println("Enter the Last Name : " );
        String lastName = sc.next();
        System.out.println("Enter the Address : " );
        String address = sc.next();
        System.out.println("Enter the City : " );
        String city = sc.next();
        System.out.println("Enter the State : " );
        String state = sc.next();
        System.out.println("Enter the ZIP Code : " );
        long zipCode = sc.nextLong();
        System.out.println("Enter the Phone Number : " );
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the E-mail: " );
       String email = sc.next();
    }
}

