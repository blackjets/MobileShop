package com.blackjets.shop.entity;

import com.blackjets.shop.model.Phone;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PhoneEntity implements RowMapper<Phone> {

    public Phone mapRow(ResultSet rs, int rowNum) throws SQLException {
        Phone phone = new Phone();
        phone.setId(rs.getInt("id"));
        phone.setCompanyName(rs.getString("company_name"));
        phone.setModel(rs.getString("model"));
        phone.setCost(rs.getBigDecimal("cost"));
        return phone;
    }
}
