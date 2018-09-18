package com.blackjets.shop.service;

import org.springframework.stereotype.Component;
import com.blackjets.shop.model.Phone;

@Component
public interface PhoneService {

   Phone getPhone(int phoneId);

   void createPhone(String companyName, String model, double cost);
   void updatePhone(int id, String companyName, String model, double cost);
   void deletePhone(int id);

}
