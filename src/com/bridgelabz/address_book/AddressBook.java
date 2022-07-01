package com.bridgelabz.address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<PersonDetails> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void personInputDetails() {

        PersonDetails personDetails = new PersonDetails();
        System.out.print("Enter First Name : ");
        personDetails.firstName = sc.next();
        System.out.print("Enter Last Name : ");
        personDetails.lastName = sc.next();
        System.out.print("Enter Address : ");
        personDetails.address = sc.next();
        System.out.print("Enter City : ");
        personDetails.city = sc.next();
        System.out.print("Enter State : ");
        personDetails.state = sc.next();
        System.out.print("Enter Email : ");
        personDetails.email = sc.next();
        System.out.print("Enter zip : ");
        personDetails.zip = sc.nextInt();
        System.out.print("Enter PhoneNumber : ");
        personDetails.phoneNumber = sc.nextLong();
        contactList.add(personDetails);

    }

    public void addContact() {
        System.out.println("Enter Number of contacts to be added");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contact details of person");
            personInputDetails();
        }
    }

    public void showDetails() {
        for (PersonDetails aBook : contactList) {
            System.out.println("First name : " + aBook.firstName);
            System.out.println("last name : " + aBook.lastName);
            System.out.println("Address : " + aBook.address);
            System.out.println("City : " + aBook.city);
            System.out.println("State : " + aBook.state);
            System.out.println("Email Id : " + aBook.email);
            System.out.println("Phone number : " + aBook.phoneNumber);
            System.out.println("Zipcode : " + aBook.zip);
        }
    }

    public void editContact() {
        System.out.println("Enter first name you want edit ");
        String firstName = sc.next();
        boolean isAvailable = false;
        for (PersonDetails contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("match found");
                isAvailable = true;
                System.out.print("Enter the First Name : ");
                contact.setFirstName(sc.next());
                System.out.print("Enter the Last Name :");
                contact.setLastName(sc.next());
                System.out.print("Enter the Address :");
                contact.setAddress(sc.next());
                System.out.print("Enter the City :");
                contact.setCity(sc.next());
                System.out.print("Enter the State :");
                contact.setState(sc.next());
                System.out.print("Enter the Zip Code :");
                contact.setZip(sc.nextLong());
                System.out.print("Enter the Phone Number :");
                contact.setPhoneNumber(sc.nextLong());
                System.out.print("Enter the EMail ID :");
                contact.setEmail(sc.next());
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }

    public void deletePerson() {

        System.out.println("Enter the first name you want to delete the contact");
        String firstName = sc.next();

        for (PersonDetails personDetails : contactList) {
            if (firstName.equals(personDetails.getFirstName())) {
                contactList.remove(personDetails);
                System.out.println("Contact deleted");
            } else {
                System.out.println("no such contact to delete");
            }
            break;
        }
    }
}

