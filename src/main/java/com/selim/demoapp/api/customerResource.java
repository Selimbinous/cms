package com.selim.demoapp.api;

import com.selim.demoapp.model.customer;
import com.selim.demoapp.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class customerResource {
    @Autowired
    private customerService customss;
    @PostMapping
    public customer addcustomer(@RequestBody customer cus){
        return customss.addcustomer(cus);

    }
    @GetMapping
    public List<customer> getcustomers(){
        return customss.getcustomers();
    }
    @GetMapping(value = "/{customer_id}")
    public customer getcustomer(@PathVariable("customer_id") int id){
        return customss.getcustumer(id);
    }
    @PutMapping(value = "/{customer_id}")
    public customer updatecustomer(@RequestBody customer cus,@PathVariable("customer_id") int i){
        return customss.customeupdate(i,cus);
    }
    @DeleteMapping(value = "/{customer_id}")
    public void deletecustomer(@PathVariable("customer_id") int i ){
        customss.deletecus(i);

    }
}

