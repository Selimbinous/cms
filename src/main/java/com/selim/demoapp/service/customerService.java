package com.selim.demoapp.service;
import com.selim.demoapp.Exeption.CustomerNotFoundException;
import com.selim.demoapp.dao.CustomerDao;
import com.selim.demoapp.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class customerService {
    @Autowired
    private CustomerDao customerdao;
    public customer addcustomer(customer cus){

        return customerdao.save(cus);

    }
    public List<customer> getcustomers(){
        return customerdao.findAll();

    }
    public customer getcustumer(int id){
        Optional<customer> cust = customerdao.findById(id);
        if(!cust.isPresent()){
            throw new CustomerNotFoundException("Customer not available...");
        }
        return cust.get();
    }
    public customer customeupdate(int id,customer cus){
        cus.setCustomer_id(id);
        return customerdao.save(cus);
    }
    public void deletecus(int id){
        customerdao.deleteById(id);
    }
}
