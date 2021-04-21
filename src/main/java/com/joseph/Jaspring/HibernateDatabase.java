package com.joseph.Jaspring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;

import java.util.Optional;

public class HibernateDatabase implements CustomerDatabase{

    private CustomerRepository customerRepository = JaspringApplication.ctx.getBean(CustomerRepository.class);



    @Override
    public boolean save(Customer customer) {
        Customer customerResult = customerRepository.save(customer);
        if (customerResult != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Customer findCustomerById(int id) {
        // Optional is a special Java feature so methods can avoid returning null.
        Optional<Customer> result = customerRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }

    }


    @Override
    public boolean removeUserById(int id) {
        customerRepository.delete(findCustomerById(id));
        return false;
    }
    }
