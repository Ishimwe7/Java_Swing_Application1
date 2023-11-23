
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Properties;
import model.Users;


public class PropertiesDao {
    
     String url="jdbc:mysql://localhost:3306/property_management_system_db";
    String username="root";
    String password="";
   // Connection con;
   // PreparedStatement pst;
    ResultSet res;
    int available_qty;
    int total_qty;
    int price;
    
    
     public boolean existingId(Properties property){
       // Properties property = new  Properties();
        String query ="select * from properties where property_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
       // if(product.getProduct_id()==null){JOptionPane.showMessageDialog(null, "connected ");}
        pst.setString(1, property.getProperty_id());
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
    
    public boolean existing(Properties property){
       // Properties property = new  Properties();
        String query ="select * from properties where property_id=? and property_name=? and property_category=? and property_type=? and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
       // if(product.getProduct_id()==null){JOptionPane.showMessageDialog(null, "connected ");}
        pst.setString(1, property.getProperty_id());
        pst.setString(2, property.getProperty_name());
        pst.setString(3, property.getProperty_category());
        pst.setString(4, property.getProperty_type());
        pst.setInt(5, property.getUser_id());
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
    
     public int totalProperties(Users user){
        String query ="select * from properties where user_id=?";
        int total_properties=0;
        //String query ="SELECT @sum := sum(total_quantity) from properties where user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, user.getCompany_id());  
      //  pst.executeQuery(query);
        ResultSet rs = pst.executeQuery();
        int qty;
       // List<Integer> all = new ArrayList<>();
        boolean flag=false; 
        while(rs.next()){
       // int total_properties = rs.getInt("@sum");
          qty=rs.getInt("total_quantity");
          total_properties=total_properties+qty;     
        }
          con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return total_properties;
    }
     
      public int totalImmovableProperties(Users user){
        String query ="select * from properties where user_id=? and property_category=?";
        int total_properties=0;
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, user.getCompany_id());
        pst.setString(2, "Immovable");
        res = pst.executeQuery();
        while(res.next()){
          int qty=res.getInt("total_quantity");
          total_properties=total_properties+qty;
        }
         con.close();
         return total_properties;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
      
        public int totalmovableProperties(Users user){
        String query ="select * from properties where user_id=? and property_category=?";
        int total_properties=0;
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, user.getCompany_id());
        pst.setString(2, "Movable");
        res = pst.executeQuery();
        while(res.next()){
          int qty=res.getInt("total_quantity");
          total_properties=qty+total_properties;
        }
          con.close();
          return total_properties;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
    
    
    
    public boolean exists(Properties property){
       // Properties property = new  Properties();
        String query ="select * from properties where property_id=? and property_name=? and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
       // if(product.getProduct_id()==null){JOptionPane.showMessageDialog(null, "connected ");}
        pst.setString(1, property.getProperty_id());
        pst.setString(2, property.getProperty_name());
        pst.setInt(3, property.getUser_id());
        res = pst.executeQuery();
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
    }
    
    
    public String comname(Properties property){
        Users user = new Users();
        return user.getCompany_name();
    }
    
    
     public String incrementQty(Properties property){
        try{          
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pst = con.prepareStatement("update properties set available_quantity=?,total_quantity=?,buying_price=? where property_id=? and property_name=? and user_id=?");
            //qty=+property.getQuantity();
            //price=+property.getBuying_price();
            pst.setInt(1, property.getAvailable_quantity());
            pst.setInt(2, property.getTotal_quantity());
            pst.setInt(3, property.getBuying_price());
            pst.setString(4, property.getProperty_id());
            pst.setString(5, property.getProperty_name());
            pst.setInt(6, property.getUser_id());
         // pst.executeUpdate();
            if(pst.executeUpdate()>0){
                con.close();
                return "Product added Successfully!!";
            }
            else{
                con.close();
                return "Recording new product failed!!";
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return "An expected error Occurred!";
    }
     
     
     public boolean decrementQty(Properties property){
        String query ="select * from properties where property_id=? and property_name=? and user_id=?";
        String update ="update properties set available_quantity=?,total_quantity=? where property_id=? and property_name=? and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        PreparedStatement psmt = con.prepareStatement(update);
       // if(product.getProduct_id()==null){JOptionPane.showMessageDialog(null, "connected ");}
        pst.setString(1, property.getProperty_id());
        pst.setString(2, property.getProperty_name());
        pst.setInt(3, property.getUser_id());
        res = pst.executeQuery();
        while(res.next()){
          int available_qty1=res.getInt("available_quantity");
          int total_qty1=res.getInt("total_quantity");
          if(available_qty1==0 ||available_qty1<property.getAvailable_quantity()){
              JOptionPane.showMessageDialog(null, "Sorry, Property is unavailable now!!");
              return false;
          }
          else{        
          available_qty1=available_qty1-property.getAvailable_quantity();
          total_qty1=total_qty1-property.getAvailable_quantity();
          property.setAvailable_quantity(available_qty1);
          property.setTotal_quantity(total_qty1);
          psmt.setInt(1, property.getAvailable_quantity());
          psmt.setInt(2, property.getTotal_quantity());
          psmt.setString(3, property.getProperty_id());
          psmt.setString(4, property.getProperty_name());
          psmt.setInt(5, property.getUser_id());
          if(total_qty1==0){
              delete(property);
              return true;
          }
          else{
          if(psmt.executeUpdate()>0){
          con.close();
          return true;
          }
         }
          }
        }
        }
       // }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public String addProperty(Properties property){
        try{
            //Properties property = new  Properties();
            String query="INSERT INTO properties (property_id, property_name, property_category, property_type, available_quantity,total_quantity, buying_price,user_id) VALUES (?,?,?,?,?,?,?,?)";
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, property.getProperty_id());
            pst.setString(2, property.getProperty_name());
            pst.setString(3, property.getProperty_category());
            pst.setString(4, property.getProperty_type());
            pst.setInt(5, property.getAvailable_quantity());
            pst.setInt(6, property.getTotal_quantity());
            pst.setInt(7, property.getBuying_price());
            pst.setInt(8, property.getUser_id());
            if(pst.executeUpdate()>0){
                con.close();
                return "Product added Successfully!!";
            }
            else{
                con.close();
                return "Recording new product failed!!";
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
            PreparedStatement pst = con.prepareStatement("update properties set available_quantity=?,total_quantity=? where property_id=? and property_name=? and user_id=?");
            pst.setInt(1, property.getAvailable_quantity());
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
    
     public int delete(Properties property){
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pst = con.prepareStatement("delete from properties where property_id=? and property_name=? and user_id=?");
            pst.setString(1,property.getProperty_id());
            pst.setString(2, property.getProperty_name());
            pst.setInt(3, property.getUser_id());
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
     
     public int update(Properties property){
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pst = con.prepareStatement("update properties set available_quantity=?,rent_quantity=?,total_quantity=?,buying_price=? where property_id=? and property_name=? and user_id=?");
            pst.setInt(1, property.getAvailable_quantity());
            pst.setInt(2, property.getRent_quantity());
            pst.setInt(3, property.getTotal_quantity());
            pst.setInt(4, property.getBuying_price());
            pst.setString(5,property.getProperty_id());
            pst.setString(6, property.getProperty_name());
            pst.setInt(7, property.getUser_id());
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
    
    
    public int sellProperty(Properties property){
        int rowsAffected=0;
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement ps =con.prepareStatement("select * from properties where property_id=? and property_name=?");
            ps.setString(1,property.getProperty_id());
            ps.setString(2, property.getProperty_name());
            while(res.next()){
               int available_qty=res.getInt("available_quantity");
               int total_qty=res.getInt("total_available");
               if(available_qty==1 && total_qty==1){
                  rowsAffected=delete(property);
               }
               else {
                   available_qty--;
                   total_qty--;
                   property.setAvailable_quantity(available_qty);
                   property.setTotal_quantity(total_qty);
                   rowsAffected = updateQtyOnSale(property);
               }
        }
            con.close();
            return rowsAffected;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
    
      public boolean found(String property_id,Integer user_id){
        
        String query ="select * from properties where property_id=?and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);     
        pst.setString(1,property_id);
        pst.setInt(2, user_id);
        res = pst.executeQuery();
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
      
      public boolean foundRent(String property_id,Integer user_id){
        
        String query ="select * from properties where property_id=?and user_id=? and rent_quantity>0";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);     
        pst.setString(1,property_id);
        pst.setInt(2, user_id);
        res = pst.executeQuery();
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
        
    
    public Properties searchProperty(String property_id,Integer user_id){
        
        String query ="select * from properties where property_id=?and user_id=?";
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);     
        pst.setString(1,property_id);
        pst.setInt(2, user_id);
        res = pst.executeQuery();
        Properties property = new Properties();
        if(res.next()){
          property.setProperty_id(res.getString("property_id"));
          property.setProperty_name(res.getString("property_name"));
          property.setProperty_category(res.getString("property_category"));
          property.setProperty_type(res.getString("property_type"));
          property.setAvailable_quantity(res.getInt("available_quantity"));
          property.setRent_quantity(res.getInt("rent_quantity"));
          property.setTotal_quantity(res.getInt("total_quantity"));
          property.setBuying_price(res.getInt("buying_price"));
        }
        con.close();
        return property;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
        
    }
    public List<Properties> allProperties(Integer id){
        String query ="select * from properties where user_id=?";
        List<Properties> allProperties= new ArrayList<Properties>();
        try{
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);  
        pst.setInt(1, id);
        res = pst.executeQuery();
        //boolean flag=false;
        while(res.next()){
          Properties property = new Properties();
          property.setProperty_id(res.getString("property_id"));
          property.setProperty_name(res.getString("property_name"));
          property.setProperty_category(res.getString("property_category"));
          property.setProperty_type(res.getString("property_type"));
          property.setAvailable_quantity(res.getInt("available_quantity"));
          property.setRent_quantity(res.getInt("rent_quantity"));
          property.setTotal_quantity(res.getInt("total_quantity"));
          property.setBuying_price(res.getInt("buying_price"));
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
