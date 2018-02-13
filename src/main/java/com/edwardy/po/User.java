package com.edwardy.po;

import java.math.BigDecimal;

/**
 * Created by yuminghua on 2/12/18.
 */
public class User {
    private BigDecimal id;
    private String name;
    private String telPhone;

    public BigDecimal getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }
}
