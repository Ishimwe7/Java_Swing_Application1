
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Properties;
import model.Sales;

public class SalesDao {
    
    String url="jdbc:mysql://localhost:3306/property_management_system_db";
    String username="root";
    String password="";
    
    
    public Sales searchProperty(String property_id,Integer user_id){
        
        String query ="select * from sales where property_id=?and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);     
        pst.setString(1,property_id);
        pst.setInt(2, user_id);
       ResultSet res = pst.executeQuery();
        Sales property = new Sales();
        if(res.next()){
          property.setProperty_id(res.getString("property_id"));
          property.setProperty_name(res.getString("property_name"));
          property.setProperty_category(res.getString("property_category"));
          property.setProperty_type(res.getString("property_type"));
          property.setTotal_quantity(res.getInt("total_quantity"));
          property.setSelling_price(res.getInt("selling_price_per_unit"));
          property.setProfit(res.getInt("profit_per_unit"));
          property.setDate(res.getString("selling_date"));
        }
        con.close();
        return property;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
        
    }
    
     public boolean exists(Sales sale){
       // Properties property = new  Properties();
        String query ="select * from sales where property_id=? and property_name=? and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
       // if(product.getProduct_id()==null){JOptionPane.showMessageDialog(null, "connected ");}
        pst.setString(1, sale.getProperty_id());
        pst.setString(2, sale.getProperty_name());
        pst.setInt(3, sale.getUser_id());
        ResultSet res = pst.executeQuery();
        while(res.next()){
          con.close();
          return true;
        }
        
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
     
      public boolean found(String property_id,Integer user_id){
        
        String query ="select * from sales where property_id=?and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);     
        pst.setString(1,property_id);
        pst.setInt(2, user_id);
        ResultSet res = pst.executeQuery();
        if(res.next()){
            con.close();
            return true;
        }
        else{
            con.close();
            return false;
        }
        }
         catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
      }
     
     
     public Integer totalSales(Integer id){
        String query ="select * from sales where  user_id=?";
        Integer total_sales=0;
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet res = pst.executeQuery();
        while(res.next()){
          int qty_per_property=res.getInt("total_quantity");
          int selling_price = res.getInt("selling_price_per_unit");
          int cost=qty_per_property*selling_price;
          total_sales=total_sales+cost;
        }
        con.close();
         return total_sales;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
     }
     
       public Integer netProfit(Integer id){
        String query ="select * from sales where  user_id=?";
        Integer total_profit=0;
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet res = pst.executeQuery();
        while(res.next()){
          int profit_per_property=res.getInt("profit_per_unit");
          int property_qty=res.getInt("total_quantity");
          int net_profit=profit_per_property*property_qty;
          total_profit=total_profit+net_profit;
        }
        con.close();
         return total_profit;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
     }
     
       
       public Integer immovableSales(Integer id){
        String query ="select * from sales where  user_id=?";
        Integer total_profit=0;
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet res = pst.executeQuery();
        while(res.next()){
          if(res.getString("property_category").equals("Immovable")){
            int profit_per_property=res.getInt("profit_per_unit");
            int property_qty=res.getInt("total_quantity");
            int net_profit=profit_per_property*property_qty;
             total_profit=total_profit+net_profit;
          }
        }
        con.close();
         return total_profit;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
     }
       
       public Integer movableSales(Integer id){
        String query ="select * from sales where  user_id=?";
        Integer total_profit=0;
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet res = pst.executeQuery();
        while(res.next()){
          if(res.getString("property_category").equals("Movable")){
           int profit_per_property=res.getInt("profit_per_unit");
           int property_qty=res.getInt("total_quantity");
           int net_profit=profit_per_property*property_qty;
           total_profit=total_profit+net_profit;
        }
        }
        con.close();
         return total_profit;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
     }
         
       public String dominant(Integer id){
        String query ="select * from sales where  user_id=?";
        int immovable=0;
        int movable=0;
        String dominant="";
      //  int total_quantity_movable=0;
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet res = pst.executeQuery();
        while(res.next()){
          if(res.getString("property_category").equals("Movable")){
              int qty_movable=res.getInt("total_quantity");
              movable=movable+qty_movable;
              //movable++;
          }
          else{
              int qty_immovable=res.getInt("total_quantity");
              immovable=immovable+qty_immovable;
             // immovable++;
          }
        }
        con.close();
        if(movable>immovable){
            dominant="Movable";
        }
        else if(movable==immovable){
             dominant="None"; 
          }
        else{
            dominant="Immovable";
        }
         return dominant;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return "";
     }
     
       public String incrementQty(Sales sale){
        try{          
            Connection con = DriverManager.getConnection(url,username,password);
            String query ="select * from sales where property_id=? and property_name=? and user_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, sale.getProperty_id());
            ps.setString(2, sale.getProperty_name());
            ps.setInt(3, sale.getUser_id());
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int total_qty=res.getInt("total_quantity");
                PreparedStatement pst = con.prepareStatement("update sales set total_quantity=? where property_id=? and property_name=? and user_id=?");
                //qty=+property.getQuantity();
               //price=+property.getBuying_price();
                pst.setInt(1, sale.getTotal_quantity()+total_qty);
               // pst.setInt(2, property.getSelling_price());
                pst.setString(2, sale.getProperty_id());
                pst.setString(3, sale.getProperty_name());
                pst.setInt(4, sale.getUser_id());
               // pst.executeUpdate();
               if(pst.executeUpdate()>0){
                  con.close();
                  return "Product selled Successfully!!";
                }
               else{
                con.close();
                return "Recording new sales failed!!";
            }
        }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return "An expected error Occurred!";
    }
       
       
     /*  
        public boolean existsIncrement(Sales property){
       // Properties property = new  Properties();
        String query ="select * from properties where property_id=? and property_name=? and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
       // if(product.getProduct_id()==null){JOptionPane.showMessageDialog(null, "connected ");}
        pst.setString(1, property.getProperty_id());
        pst.setString(2, property.getProperty_name());
        pst.setInt(3, property.getUser_id());
        ResultSet res = pst.executeQuery();
        while(res.next()){
          available_qty=res.getInt("available_quantity");
          total_qty=res.getInt("total_quantity");
          available_qty=available_qty+property.getAvailable_quantity();
          total_qty=total_qty+property.getTotal_quantity();
          property.setAvailable_quantity(available_qty);
          property.setTotal_quantity(total_qty);
          price=res.getInt("buying_price");
          price=price+property.getBuying_price();
          property.setBuying_price(price);
          con.close();
          return true;
        }
        
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    } */
    
    public String addSales(Sales sale){
        try{
            //Properties property = new  Properties();
            String query="INSERT INTO Sales (property_id, property_name, property_category, property_type, profit_per_unit,total_quantity, selling_price_per_unit,user_id) VALUES (?,?,?,?,?,?,?,?)";
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, sale.getProperty_id());
            pst.setString(2, sale.getProperty_name());
            pst.setString(3, sale.getProperty_category());
            pst.setString(4, sale.getProperty_type());
            pst.setInt(5, sale.getProfit());
            pst.setInt(6, sale.getTotal_quantity());
            pst.setInt(7, sale.getSelling_price());
            pst.setInt(8, sale.getUser_id());
            if(pst.executeUpdate()>0){
                con.close();
                return "Product selled Successfully!!";
            }
            else{
                con.close();
                return "Recording sales failed!!";
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return "An expected error Occurred!";
    }
    
    public int updateQtyOnSale(Properties property){
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pst = con.prepareStatement("update sales set total_quantity=?,profit_per_unit where property_id=? and property_name=? and user_id=?");
            pst.setInt(1, property.getTotal_quantity());
            pst.setInt(2, property.getTotal_quantity());
            pst.setString(3,property.getProperty_id());
            pst.setInt(4, property.getUser_id());
            pst.setString(4, property.getProperty_name());
            if(pst.executeUpdate()>0){
                return 1;
            }
            else
                return 0;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
    
     public List<Sales> allSales(Integer id){
        String query ="select * from Sales where user_id=?";
        List<Sales> allProperties= new ArrayList<Sales>();
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);  
        pst.setInt(1, id);
        ResultSet res = pst.executeQuery();
        //boolean flag=false;
        while(res.next()){
          Sales property = new Sales();
          property.setProperty_id(res.getString("property_id"));
          property.setProperty_name(res.getString("property_name"));
          property.setProperty_category(res.getString("property_category"));
          property.setProperty_type(res.getString("property_type"));;
          property.setTotal_quantity(res.getInt("total_quantity"));
          property.setSelling_price(res.getInt("selling_price_per_unit"));
          property.setProfit(res.getInt("profit_per_unit"));
          property.setDate(res.getString("selling_date"));
          allProperties.add(property);
        }
        con.close();
        return allProperties;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
     
