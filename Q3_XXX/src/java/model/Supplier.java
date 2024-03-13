/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author KieuVietPhuoc
 */
public class Supplier {
    private String SupplierID;
    private String SupplierName;
    private String BirthDate;
    private boolean Gender;
    private Type type;

    public Supplier() {
    }

    public Supplier(String SupplierID, String SupplierName, String BirthDate, boolean Gender, Type type) {
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.BirthDate = BirthDate;
        this.Gender = Gender;
        this.type = type;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

     public String getBirthDate() throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = inputFormat.parse(BirthDate);
        return outputFormat.format(date);
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
}
