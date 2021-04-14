package com.joseph.Jaspring;

public interface CustomerDatabase{
    boolean save(Customer customer);

    Customer findCustomerById(int id);

    boolean removeUserById(int id);
}
