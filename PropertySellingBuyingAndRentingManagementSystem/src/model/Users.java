
package model;

/**
 *
 * @author hp
 */
public class Users {
    private Integer company_id;
    private String company_name;
    private String company_owner;
    private String email;
    private String address;
    private String password;

    public Users() {
    }

    public Users(Integer company_id, String company_name, String company_owner, String email, String address, String password) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_owner = company_owner;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_owner() {
        return company_owner;
    }

    public void setCompany_owner(String company_owner) {
        this.company_owner = company_owner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
