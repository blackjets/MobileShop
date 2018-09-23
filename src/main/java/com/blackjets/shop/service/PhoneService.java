package com.blackjets.shop.service;

import org.springframework.stereotype.Component;
import com.blackjets.shop.model.Phone;

import java.math.BigDecimal;
import java.util.List;

@Component
public interface PhoneService {

   Phone getPhone(int phoneId);

   void createPhone(String companyName, String model, BigDecimal cost);
   void updatePhone(int id, String companyName, String model, BigDecimal cost);
   void deletePhone(int id);
   List<Phone> getPhoneList();

}
