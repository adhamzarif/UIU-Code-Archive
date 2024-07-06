package Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber, address);
                    addressBook.addContact(newContact);
                    break;
                case 2:
                    addressBook.displayContacts();
                    System.out.print("Enter index of contact to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character after nextInt()
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    Contact updatedContact = new Contact(newName, newPhoneNumber, newAddress);
                    addressBook.updateContact(updateIndex, updatedContact);
                    break;
                case 3:
                    addressBook.displayContacts();
                    System.out.print("Enter index of contact to delete: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character after nextInt()
                    addressBook.deleteContact(deleteIndex);
                    break;
                case 4:
                    addressBook.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting the Address Book.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
