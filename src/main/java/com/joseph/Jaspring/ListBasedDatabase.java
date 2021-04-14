package com.joseph.Jaspring;

import java.util.ArrayList;
import java.util.List;

public class ListBasedDatabase implements CustomerDatabase{

    private List<Customer> customerList;


    public ListBasedDatabase() {
        customerList = new ArrayList<Customer>();
    }

    @Override
    public boolean save(Customer customer) {
        return customerList.add(customer);

    }

    @Override
    public Customer findCustomerById(int id) {
        for (Customer customer : customerList) {
            if (customer.id == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public boolean removeUserById(int id){
        customerList.remove(customerList.indexOf(findCustomerById(id)));
                return true;
        }

     /** Pst... Joseph, example of a method that is not part of the CustomerDatabase interface **/
    public void myOtherMethod() {
        System.out.println("Another method for implemented class from an interface");
    }
}
