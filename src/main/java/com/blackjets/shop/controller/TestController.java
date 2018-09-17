package com.blackjets.shop.controller;

import com.blackjets.shop.model.Phone;
import com.blackjets.shop.repository.PhoneDao;
import com.blackjets.shop.repository.PhoneDaoImpl;
import com.blackjets.shop.service.PhoneService;
import com.blackjets.shop.service.PhoneServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping(value = "/hello")
    public String test() {
        return "hello";
    }

    @RequestMapping(value = "/phone/{id}", method = RequestMethod.GET)
    public String getPhoneById(@PathVariable String id) {
        Phone mobile = phoneService.getPhone(Integer.parseInt(id));
        String output = (PhoneService.getPhone(Integer.parseInt(id))).getCompanyName() + tempPhone.getCompanyName() + " " + tempPhone.getModel() + " " +
                                    tempPhone.getCost();
        return output; }
}