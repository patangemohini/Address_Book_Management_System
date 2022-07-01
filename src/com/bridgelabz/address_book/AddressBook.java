package com.bridgelabz.address_book;

import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);

    public void personInputDetails() {
        PersonDetails personDetails = new PersonDetails();
        System.out.print("Enter First Name : ");
        personDetails.firstName = sc.nextLine();
        System.out.print("Enter Last Name : ");
        personDetails.lastName = sc.nextLine();
        System.out.print("Enter Address : ");
        personDetails.address = sc.nextLine();
        System.out.print("Enter City : ");
        personDetails.city = sc.nextLine();
        System.out.print("Enter State : ");
        personDetails.state = sc.nextLine();
        System.out.print("Enter Email : ");
        personDetails.email = sc.nextLine();
        System.out.print("Enter zip : ");
        personDetails.zip = sc.nextInt();
        System.out.print("Enter PhoneNumber : ");
        personDetails.phoneNumber = sc.nextLong();
    }
}

