/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.product;

/**
 *
 * @author duynh
 */
public class productdal extends BaseDal {

    public void insertnewproduct(product p) {
        try {
            String sql = "INSERT INTO [product]\n"
                    + "           ([id]\n"
                    + "           ,[name]\n"
                    + "           ,[importDate]\n"
                    + "           ,[isActive]\n"
                    + "           ,[proid]\n"
                    + "           ,[cateid]\n"
                    + "           ,[price])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, p.getId());
            stm.setString(2, p.getName());
            stm.setDate(3, p.getImportDate());
            stm.setBoolean(4, p.isIsActive());
            stm.setInt(5, p.getProid().getProid());
            stm.setInt(6, p.getCateid().getCateid());
            stm.setInt(7, p.getPrice());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productdal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
