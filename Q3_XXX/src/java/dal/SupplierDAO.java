/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import model.Supplier;

/**
 *
 * @author KieuVietPhuoc
 */
public class SupplierDAO extends DBContext{
     public Vector<Supplier> getAllClass(String TypeName,String Dob) {
        Vector<Supplier> supplier = new Vector<Supplier>();
        TypeDAO dao = new TypeDAO();
        String sql = "SELECT * FROM Suppliers Where 1=1";
        
        if(TypeName!=null && !TypeName.isEmpty()){ 
            
            sql = sql + " AND TypeID = "+dao.getTypeByName(TypeName).getTypeID();
        
        }
        if(Dob!=null && !Dob.isEmpty()) sql = sql + " AND BirthDate = '"+Dob+" 00:00:00:000'";
        try {
            Statement state = connection.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                Supplier classa;
                classa = new Supplier(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), dao.getTypeByID(rs.getString(5)));
                supplier.add(classa);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return supplier;
    } 
}
