package com.blackjets.shop.controller;

import com.blackjets.shop.model.Phone;
import com.blackjets.shop.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

        Phone mobile = phoneService.getPhone(id);
        return mobile;
//        String output = mobile.getCompanyName() + " | " + mobile.getModel() + " " +
//                mobile.getCost();
//        return output;
    }

    @RequestMapping(value = "/insert/{company_name}/{model}/{cost}")
    public void createPhone(@PathVariable String company_name, String model, Integer cost) {
        createPhone(company_name, model, cost);
    }
}