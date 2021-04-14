package com.joseph.Jaspring;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleView {


    /**
     * Ask customer what they want
     *
     * @return
     **/
    public UserChoice requestAction() {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("What do u want to do?\n");
            System.out.println("1. Add new customer\n");
            System.out.println("2. Get customer by id\n");
            System.out.println("3. Remove customer by id\n");
            System.out.println("4. Exit\n");

            int choice = input.nextInt();
            switch (choice) {
                case 1 -> { return UserChoice.CREATE; }
                case 2 -> { return UserChoice.GETBYID;}
                case 3 -> { return UserChoice.REMOVEBYID;}
                case 4 -> { return UserChoice.EXIT;}
                default -> { return UserChoice.NONE; }
            }
        } catch (InputMismatchException ime) {
            System.out.println("failed!");
            return null;
        }

    }

    public Customer getCustomer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Plz enter customer name\n");
        String name = input.nextLine();

        System.out.println("Plz enter customer age\n");
        int age = input.nextInt();

        System.out.println("Plz enter customer id\n");
        int id = input.nextInt();

        Customer customer = new Customer(id, name, age, "5500 Park avenue");
        return customer;
    }

    /**get id from user and  Returns null if failed to enter properly */
    public int getIdToRetrieve() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter id of customer to retrieve");
            int id = input.nextInt();

            return id;
        } catch (InputMismatchException ime) {
            System.out.println("Failed input");
            return 0;
        }
    }

    public void showCustomer(Customer customer) {
        System.out.println("Customer {" +"id=" + customer.id +", name=" + customer.name + '\'' + ", age=" + customer.age +'}');
    }

}
