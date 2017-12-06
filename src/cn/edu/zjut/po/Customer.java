package cn.edu.zjut.po;

import java.sql.Date;

/**
 * Created by 92377 on 2017/11/8.
 */
public class Customer {
    private int customerId;
    private String account;
    private String name;
    private String password;
    private String sex;
    private Date birthday;
    private ContactInfo contactInfo;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getPhone() {
        return contactInfo.getPhone();
    }

    public void setPhone(String phone) {
        contactInfo.setPhone(phone);
    }

    public String getEmail() {
        return contactInfo.getEmail();
    }

    public void setEmail(String email) {contactInfo.setEmail(email);}

    public String getAddress() {
        return contactInfo.getAddress();
    }

    public void setAddress(String address) {
        contactInfo.setAddress(address);
    }

    public String getZipcode() {
        return contactInfo.getZipcode();
    }

    public void setZipcode(String zipcode) {
        contactInfo.setZipcode(zipcode);
    }

    public String getFax() {
        return contactInfo.getFax();
    }

    public void setFax(String fax) {
        contactInfo.setFax(fax);
    }

    public Customer() {
        super();
        contactInfo=new ContactInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != customer.customerId) return false;
        if (account != null ? !account.equals(customer.account) : customer.account != null) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (password != null ? !password.equals(customer.password) : customer.password != null) return false;
        if (sex != null ? !sex.equals(customer.sex) : customer.sex != null) return false;
        if (birthday != null ? !birthday.equals(customer.birthday) : customer.birthday != null) return false;
//        if (phone != null ? !phone.equals(customer.phone) : customer.phone != null) return false;
//        if (email != null ? !email.equals(customer.email) : customer.email != null) return false;
//        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;
//        if (zipcode != null ? !zipcode.equals(customer.zipcode) : customer.zipcode != null) return false;
//        if (fax != null ? !fax.equals(customer.fax) : customer.fax != null) return false;

        return true;
    }
//
//    @Override
//    public int hashCode() {
//        int result = customerId;
//        result = 31 * result + (account != null ? account.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (sex != null ? sex.hashCode() : 0);
//        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
//        result = 31 * result + (fax != null ? fax.hashCode() : 0);
//        return result;
//    }
}
