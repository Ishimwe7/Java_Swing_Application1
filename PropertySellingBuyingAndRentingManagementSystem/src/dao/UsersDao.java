
package dao;

import java.sql.*;
import java.sql.DriverManager;
import model.Users;

/**
 *
 * @author hp
 */
public class UsersDao {
    
    String url="jdbc:mysql://localhost:3306/property_management_system_db";
    String username="root";
    String password="";
    
    public String addUser(Users user){
        Users newUser = new Users();
        String feedback;
        String query="insert into users(company_id,company_name,company_owner,email,address,password) values(?,?,?,?,?,?,?)";
        try{
            Connection con = DriverManager.getConnection(url, username,password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, newUser.getCompany_id());
            pst.setString(2, newUser.getCompany_name());
            pst.setString(3, newUser.getCompany_owner());
            pst.setString(4, newUser.getEmail());
            pst.setString(5, newUser.getAddress());
            pst.setString(6, newUser.getPassword());
           int rowsAffected = pst.executeUpdate();
            if(rowsAffected>0){
                feedback="Registration Completed SuccessFully!";
            }
            else{
                feedback="Registration Failed!";
            }
            return feedback;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    
     public boolean Exists(Integer id){
        String query="select * from users where company_id=?";
        try{
            Connection con = DriverManager.getConnection(url, username,password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);                           
           // pst.setString(3, searchUser.getPassword());
            ResultSet res = pst.executeQuery();
            while(res.next()){
                Users user = new Users();
                user.setCompany_name(res.getString("company_name"));
                user.setEmail(res.getString("email"));
                //user.setPassword(res.getString("password")); 
                con.close();
                return true;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    
    public Users login(Users searchUser){
        String query="select * from users where company_name=? and company_id=? and password=?";
        try{
            Connection con = DriverManager.getConnection(url, username,password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, searchUser.getCompany_name());
            pst.setInt(2, searchUser.getCompany_id());                           
            pst.setString(3, searchUser.getPassword());
            ResultSet res = pst.executeQuery();
            while(res.next()){
                Users user = new Users();
                user.setCompany_name(res.getString("company_name"));
                user.setEmail(res.getString("email"));
                //user.setPassword(res.getString("password")); 
                con.close();
                return user;
            }
           /* if(res.next()){
               // Users user = new Users();
                searchUser.setCompany_name(res.getString("company_name"));
                searchUser.setEmail(res.getString("email"));
                searchUser.setPassword(res.getString("password")); 
                con.close();
                return searchUser;
            }
            else{
                return null;
            }*/
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public int register(Users newUser){
        try{
            String query ="insert into users(company_id,company_name,company_owner,email,address,password) values(?,?,?,?,?,?)";
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, newUser.getCompany_id());
            pst.setString(2, newUser.getCompany_name());
            pst.setString(3, newUser.getCompany_owner());
            pst.setString(4, newUser.getEmail());
            pst.setString(5, newUser.getAddress());
            pst.setString(6, newUser.getPassword());
            int rowsAffected = pst.executeUpdate();
            con.close();
            return rowsAffected;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
    
}
