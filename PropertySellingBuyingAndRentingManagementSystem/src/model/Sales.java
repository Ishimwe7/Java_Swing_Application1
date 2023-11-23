
package model;

public class Sales {
    
    private String property_id;
    private String property_name;
    private String property_category;
    private String property_type;
    private Integer selling_price;
    private Integer profit;
    private Integer user_id;
    private Integer total_quantity;
    private String date;

    public Sales() {
    }

    public Sales(String property_id, String property_name, String property_category, String property_type, Integer selling_price, Integer profit,Integer user_id, Integer total_quantity,String date) {
        this.property_id = property_id;
        this.property_name = property_name;
        this.property_category = property_category;
        this.property_type = property_type;
        this.selling_price = selling_price;
        this.profit = profit;
        this.user_id=user_id;
        this.total_quantity = total_quantity;
        this.date=date;
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

    public Integer getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(Integer selling_price) {
        this.selling_price = selling_price;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getTotal_quantity() {
        return total_quantity;
    }

    public void setTotal_quantity(Integer total_quantity) {
        this.total_quantity = total_quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
