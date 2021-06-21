import java.util.ArrayList;
import java.util.Scanner;

/**
 * Getting input from user and set that input in the constructor
 * And adding contact to address book
 * And editing person details
 * @author Chaitra NS
 * @since 21 Jun 2021
 * @version 2.0
 */

public class AddressSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contactList = new ArrayList<Contact>();

       Contact contact = new Contact();

       System.out.println("Enter 1 to add contact \nEnter 2 to edit");
        System.out.println("Enter the option : ");
        int option = sc.nextInt();
        switch (option){
            case 1 :
                System.out.println("Add");
                System.out.println("Enter the First Name : " );
                String firstName = sc.next();
                contact.setFirstName(firstName);

                System.out.println("Enter the Last Name : " );
                String lastName = sc.next();
                contact.setLastName(lastName);

                System.out.println("Enter the Address : " );
                String address = sc.next();
                contact.setAddress(address);

                System.out.println("Enter the City : " );
                String city = sc.next();
                contact.setCity(city);

                System.out.println("Enter the State : " );
                String state = sc.next();
                contact.setState(state);

                System.out.println("Enter the ZIP Code : " );
                long zipCode = sc.nextLong();
                contact.setZip(zipCode);

                System.out.println("Enter the Phone Number : " );
                long phoneNumber = sc.nextLong();
               contact.setPhoneNumber(phoneNumber);

                System.out.println("Enter the E-mail: " );
                String email = sc.next();
                contact.setEmail(email);

                contactList.add(contact);

                for (Contact c : contactList){
                    System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAddress() + " " + c.getCity() + " " + c.getState() + " " + c.getPhoneNumber() + " " + c.getZip() + " " + c.getEmail());
               }
                break;

            case 2 :
                System.out.println("Edit");
                System.out.println("Enter the first Name : " );
                String name = sc.next();
                for(int i = 0; i < contactList.size(); i++ ){
                    if (contactList.get(i).getFirstName().equals(name)){
                        System.out.println("Enter the Last Name : " );
                        String newLastName = sc.next();
                        contact.setLastName(newLastName);

                        System.out.println("Enter the Address : " );
                        String newAddress = sc.next();
                        contact.setAddress(newAddress);

                        System.out.println("Enter the City : " );
                        String newCity = sc.next();                        contact.setCity(newCity);

                        System.out.println("Enter the State : " );
                        String newState = sc.next();
                        contact.setState(newState);

                        System.out.println("Enter the ZIP Code : " );
                        long newZipCode = sc.nextLong();
                        contact.setZip(newZipCode);

                        System.out.println("Enter the Phone Number : " );
                        long newPhoneNumber = sc.nextLong();
                        contact.setPhoneNumber(newPhoneNumber);

                        System.out.println("Enter the E-mail: " );
                        String newEmail = sc.next();
                        contact.setEmail(newEmail);
                   }
                }
               break;

           default:
                System.out.println("Invalid Option");
       }
   }
}