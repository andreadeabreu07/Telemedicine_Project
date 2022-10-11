/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Client;

/**
 *
 * @author andre
 */

import java.util.*;


public class Patient {
    
    private String name;
    private String lastname;
    private Integer id;
    private String gender;
    private String address;
    private String telephone;
    private Date dob;
    Signals signal;

    public Patient(String name, String lastname, Integer id, String gender, String address, String telephone, Date dob, Signals signal) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.gender = gender;
        this.address = address;
        this.telephone = telephone;
        this.dob = dob;
        this.signal = signal;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Signals getSignal() {
        return signal;
    }

    public void setSignal(Signals signal) {
        this.signal = signal;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", lastname=" + lastname + ", id=" + id + ", gender=" + gender + ", address=" + address + ", telephone=" + telephone + ", dob=" + dob + ", signal=" + signal + '}';
    }
    
    
}
