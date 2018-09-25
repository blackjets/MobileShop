package com.blackjets.shop.controller;

import com.blackjets.shop.model.Phone;
import com.blackjets.shop.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class TestController {

    private final PhoneService phoneService;

    @Autowired
    public TestController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @RequestMapping(value = "/hello")
    public String test() {
        return "hello";
    }

    @RequestMapping(value = "/phone/{id}", method = RequestMethod.GET)
    public Phone getPhoneById(@PathVariable Integer id) {
        return phoneService.getPhone(id);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/phone")
    public List<Phone> getPhoneList(){
        return phoneService.getPhoneList();
    }

    @RequestMapping(value = "/insert/{company_name}/{model}/{cost}")
    public String createPhone(@PathVariable String company_name, @PathVariable String model, @PathVariable BigDecimal cost) {
        phoneService.createPhone(company_name, model, cost);
        return "Create successful";
    }
    @RequestMapping(value = "/delete/{id}")
    public String deletePhone(@PathVariable Integer id){
        phoneService.deletePhone(id);
        return "delete successful";
    }

}