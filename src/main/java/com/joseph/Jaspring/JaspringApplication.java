package com.joseph.Jaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JaspringApplication {

    public static void main(String[] args) {
//        SpringApplication.run(JaspringApplication.class, args);


//      ArrayList<Customer> myArray = new ArrayList<Customer>();

//        Customer customer1 = new Customer(01,"Tom Hardy",25,"3210 Guy Avenue" );
//        customerDatabase.save(customer1);
//        Customer customer2 = new Customer(02, "Nelly Fox", 20, "5555 fox");
//        customerDatabase.save(customer2);


        ConsoleView view = new ConsoleView();
        CustomerDatabase customerDatabase = new ListBasedDatabase();
//        Customer myCustomer = view.getCustomer();
        myController controller = new myController();
        controller.configure(view, customerDatabase);

        while (true) {
            controller.getAndDoNextAction();
            System.out.println("OK!");
        }
//        myArray.add(customer1);
//        System.out.println(myArray.get(0).name);


//
//        customerDatabase.save(myCustomer);






//        ListBasedDatabase lb = (ListBasedDatabase) customerDatabase;
//        lb.myOtherMethod();
    }


}
