/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp
 */
public class Properties {
    
    private String property_id;
    private String property_name;
    private String property_category;
    private String property_type;
    private Integer buying_price;
    private Integer available_quantity;
    private Integer rent_quantity;
    private Integer total_quantity;
    private Integer user_id;

    public Properties() {
    }

    public Properties(String property_id, String property_name, String property_category, String property_type, Integer buying_price, Integer available_quantity,Integer rent_quantity, Integer total_quantity,Integer user_id) {
        this.property_id = property_id;
        this.property_name = property_name;
        this.property_category = property_category;
        this.property_type = property_type;
        this.buying_price = buying_price;
        this.available_quantity = available_quantity;
        this.rent_quantity = rent_quantity;
        this.total_quantity = total_quantity;
        this.user_id=user_id;
        
    }

    public String getProperty_id() {
        return property_id;
    }

    public void setProperty_id(String property_id) {
        this.property_id = property_id;
    }

    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public String getProperty_category() {
        return property_category;
    }

    public void setProperty_category(String property_category) {
        this.property_category = property_category;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public Integer getBuying_price() {
        return buying_price;
    }

    public void setBuying_price(Integer buying_price) {
        this.buying_price = buying_price;
    }

    public Integer getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(Integer available_quantity) {
        this.available_quantity = available_quantity;
    }

    public Integer getRent_quantity() {
        return rent_quantity;
    }

    public void setRent_quantity(Integer rent_quantity) {
        this.rent_quantity = rent_quantity;
    }

    public Integer getTotal_quantity() {
        return total_quantity;
    }

    public void setTotal_quantity(Integer total_quantity) {
        this.total_quantity = total_quantity;
    }   
    
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
    
    
}
