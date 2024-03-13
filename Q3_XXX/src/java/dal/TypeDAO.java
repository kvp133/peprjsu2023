/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Type;

/**
 *
 * @author KieuVietPhuoc
 */
public class TypeDAO extends DBContext{
    public Type getTypeByID(String id){
        Type type = null;
        String sql = "select * from Types Where TypeID = ?";
         try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, id);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                type = new Type(rs.getString(1),rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
      
        return type;
    }
    public Type getTypeByName(String id){
        Type type = null;
        String sql = "select * from Types Where TypeName = ?";
         try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, id);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                type = new Type(rs.getString(1),rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
      
        return type;
    }
    
}
