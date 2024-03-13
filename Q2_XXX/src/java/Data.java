
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KieuVietPhuoc
 */
public class Data {
    String Code;
    String Name;
    Date Date;

    public Data() {
    }

    public Data(String Code, String Name, String Date) throws ParseException {
        this.Code = Code;
        this.Name = Name;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/yyyy");
        Date abc = sdf.parse(Date);
        this.Date = abc;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        String a = sdf.format(Date);
        
        return a;
    }

    public void setDate(Date Date) {
        this.Date = Date;
        
    }
    public static void main(String[] args) {
        System.out.println(new Data().getDate());
    }
    
}
