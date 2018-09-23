package com.blackjets.shop.repository;

import com.blackjets.shop.model.Phone;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public interface PhoneDao {

    //SELECT * FROM mobile WHERE id = {id}
    Phone getPhone(int id);

    //DELETE FROM mobile WHERE id = {id}
    void deletePhone(int id);

    //INSERT INTO mobile(,company_name,com.blackjets.shop.model,cost) values{}
    void insertPhone(Phone bean);

    void updatePhone(int id, String companyName, String model, BigDecimal cost);

    List<Phone> getPhoneList();


}
