package contacts;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ContactsManager {
    private static ArrayList<Contact> contactsList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readContactsFromFile(); // Read contacts from file when the application starts
        int option;
        do {
            displayMenu();
            System.out.print("Enter an option (1-5): ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()

            switch (option) {
                case 1:
                    viewContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 5);

        writeContactsToFile(); // Write contacts to file before the application exits
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
    }

    private static void viewContacts() {
        System.out.println("Name\t\t| Phone number");
        System.out.println("-----------------------");
        for (Contact contact : contactsList) {
            System.out.println(contact);
        }
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);
        contactsList.add(contact);
        System.out.println("contacts.Contact added successfully.");
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Contact contact : contactsList) {
            if (contact.getName().equalsIgnoreCase(searchName)) {
                System.out.println("contacts.Contact found:");
                System.out.println(contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("contacts.Contact not found.");
        }
    }

    private static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String deleteName = scanner.nextLine();
        Contact foundContact = null;
        for (Contact contact : contactsList) {
            if (contact.getName().equalsIgnoreCase(deleteName)) {
                foundContact = contact;
                break;
            }
        }
        if (foundContact != null) {
            contactsList.remove(foundContact);
            System.out.println("contacts.Contact deleted successfully.");
        } else {
            System.out.println("contacts.Contact not found.");
        }
    }

    private static void readContactsFromFile() {
        String directory = "absolute_directory_path";
        String filename = "contacts.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            BufferedReader reader = new BufferedReader(new FileReader(dataFile.toFile()));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String phoneNumber = parts[1].trim();
                    Contact contact = new Contact(name, phoneNumber);
                    contactsList.add(contact);
                }
            }
            reader.close();
            System.out.println("Contacts loaded from file successfully.");
        } catch (IOException e) {
            System.out.println("Failed to read contacts from file: " + e.getMessage());
        }
    }

    private static void writeContactsToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt"))) {
            for (Contact contact : contactsList) {
                writer.write(contact.getName() + " | " + contact.getPhoneNumber());
                writer.newLine();
            }
            System.out.println("Contacts written to file successfully.");
        } catch (IOException e) {
            System.out.println("Failed to write contacts to file: " + e.getMessage());
        }
    }
}
