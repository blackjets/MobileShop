package com.blackjets.shop.controller;

import com.blackjets.shop.entity.PhoneEntity;
import com.blackjets.shop.model.Phone;
import com.blackjets.shop.repository.PhoneDao;
import com.blackjets.shop.repository.PhoneDaoImpl;
import com.blackjets.shop.service.PhoneService;
import com.blackjets.shop.service.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    PhoneDao phoneDaoImpl;
    PhoneService phoneService = new PhoneServiceImpl(phoneDaoImpl);

    @RequestMapping(value = "/hello")
    public String test() {
        return "hello";
    }

    @RequestMapping(value = "/phone/{id}", method = RequestMethod.GET)
    public String getPhoneById(@PathVariable String id) {

        Phone mobile = phoneService.getPhone(Integer.parseInt(id));
        String output = mobile.getCompanyName() + mobile.getCompanyName() + " " + mobile.getModel() + " " +
                                    mobile.getCost();
        return output; }

    @RequestMapping(value = "/insert/{company_name}/{model}/{cost}")
    public void createPhone(@PathVariable String company_name, String model, Integer cost){
        createPhone(company_name,model,cost);
    }
}