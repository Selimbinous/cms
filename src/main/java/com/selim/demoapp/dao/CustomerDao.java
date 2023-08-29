package com.selim.demoapp.dao;

import com.selim.demoapp.model.customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDao extends CrudRepository<customer, Integer> {

    @Override
    List<customer> findAll();
}
