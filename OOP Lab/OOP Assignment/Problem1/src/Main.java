import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        addressBook.addContact(new Contact("Adham", "17/A BK Road", "1234"));
        addressBook.addContact(new Contact("Zarif", "22/A Babu Khan Road", "5678"));
        addressBook.addContact(new Contact("Seam", "17/D Haji Road", "8765"));
        addressBook.addContact(new Contact("Hassan", "15/L Khan Bahadur Road", "4321"));
        addressBook.addContact(new Contact("Kader", "130/6 Mohshin Road", "3456"));

        boolean exit = true;
        while(exit) {
            System.out.println("Enter your choice:");
            System.out.println("1. View Contacts");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                addressBook.viewContacts();
            } else if (input == 2) {
                System.out.print("Enter the name of the contact to update: ");
                String nameToUpdate = scanner.nextLine();
                addressBook.updateContact(nameToUpdate);
            } else if (input == 3) {
                System.out.print("Enter the name of the contact to delete: ");
                String nameToDelete = scanner.nextLine();
                addressBook.deleteContact(nameToDelete);
            } else if (input == 4) {
                exit = false;
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
