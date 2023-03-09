package com.bridgelabz;
import java.util.Scanner;

public class AddressBook {
//first and last names, address,
//city, state, zip, phone number and
//email...
    public String firstname,lastname,address,state,city,email;
    int zip;
    long phonenumber;
    public static void getDetails(){
        AddressBook a = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your FIrst name:-");
        a.firstname=sc.next();
        System.out.println("Enter Your last name:-");
        a.lastname=sc.next();
        System.out.println("Enter your Phone Number:-");
        a.phonenumber=sc.nextLong();
        System.out.println("Enter your address:- ");
        a.address=sc.next();
        System.out.println("Enter your State:-");
        a.state=sc.next();
        System.out.println("Enter Your city:-");
        a.city=sc.next();
        System.out.println("Enter zip code:- ");
        a.zip=sc.nextInt();
        System.out.println("Enter your email:- ");
        a.email=sc.next();
        System.out.println("First Name: " +a.firstname);
        System.out.println("Last Name : " +a.lastname);
        System.out.println("Last Name : " +a.address);
        System.out.println("City : " +a.city);
        System.out.println("State Name : " +a.state);
        System.out.println("Zip Code : " +a.zip);
        System.out.println("Phone Number : " +a.phonenumber);
        System.out.println("Email Id : " +a.email);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        getDetails();
    }
}