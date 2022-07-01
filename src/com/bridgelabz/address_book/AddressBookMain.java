package com.bridgelabz.address_book;

import java.util.Scanner;

public class AddressBookMain {

    static final int ADD_CONTACT = 1;
    static final int DISPLAY_DETAILS = 2;
    static final int EDIT_CONTACT = 3;

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book program!!!");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.println("----------------------------------");
            System.out.println(" 1.Add a new contact.");
            System.out.println(" 2.display contact.");
            System.out.println(" 3.edit contact.");
            System.out.println("_________________________________");
            option = sc.nextInt();
            switch (option) {
                case ADD_CONTACT:
                    addressBook.personInputDetails();
                    break;
                case DISPLAY_DETAILS:
                    addressBook.showDetails();
                    break;
                case EDIT_CONTACT:
                    addressBook.editContact();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}