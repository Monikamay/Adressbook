
package aitc.monika;

import java.util.StringJoiner;

/**
 * Created by studenta on 04.05.2017.
 */
public class MyRecord {
    String Name, Surname;
    String Phone;
    String PostalAddress;
    String E_mail;
    String Website;

    /*String Name, Surname, Phone, PostalAddress, E_mail, Website;*/
    MyRecord (String Name, String Surname, String Phone, String PostalAddress, String E_mail, String Website){
        this.Name = Name;
        this.Surname = Surname;
        this.Phone = Phone;
        this.PostalAddress = PostalAddress;
        this.E_mail = E_mail;
        this.Website = Website;
    }


    public void setName(String name) {
        this.Name = Name;

    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPostalAddress(String postalAddress) {
        this.PostalAddress = postalAddress;
    }

    public String getPostalAddress() {
        return PostalAddress;
    }

    public void setE_mail(String e_mail) {
        this.E_mail = E_mail;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getWww() {
        return Website;
    }
}


