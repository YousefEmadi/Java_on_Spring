package com.joseph.Jaspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


@SpringBootApplication
public class JaspringApplication implements ApplicationContextAware {
    public static ApplicationContext ctx;

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        ctx = applicationContext;
    }


    public static void main(String[] args) {
        SpringApplication.run(JaspringApplication.class, args);


//      ArrayList<Customer> myArray = new ArrayList<Customer>();

//        Customer customer1 = new Customer(01,"Tom Hardy",25,"3210 Guy Avenue" );
//        customerDatabase.save(customer1);
//        Customer customer2 = new Customer(02, "Nelly Fox", 20, "5555 fox");
//        customerDatabase.save(customer2);


        ConsoleView view = new ConsoleView();


        CustomerDatabase customerDatabase = new HibernateDatabase();

//        CustomerDatabase customerDatabase = new ListBasedDatabase();

        myController controller = new myController();
        controller.configure(view, customerDatabase);

        while (true) {
            controller.getAndDoNextAction();
            System.out.println("OK!");
        }





//        ListBasedDatabase lb = (ListBasedDatabase) customerDatabase;
//        lb.myOtherMethod();
    }



}
