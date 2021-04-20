package com.joseph.Jaspring;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <Customer, Integer> {
}
