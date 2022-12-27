/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.People;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duynh
 */
//People CRUD

public class PeopelDAO {
    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection connection = null;
    private DAO db = null;

    public PeopelDAO () {
        db = new DAO();
    }
    public void addPeople(People p) {
        String sql = "CREATE TABLE IF NOT EXISTS People(Id INT, name VARCHAR(500),Dob DATETIME, Gender BIT)";
        String insertsql = "Insert into People values(?,?,?,?)";
        try { 
            connection = db.getConnection();
            stm = connection.prepareStatement(sql);
            stm.execute();
            stm = connection.prepareStatement(insertsql);
            stm.setInt(1, p.getId());
            stm.setString(2, p.getName());
            stm.setDate(3, p.getDOB());
            stm.setBoolean(4, p.getGender());
            stm.executeUpdate();
            System.out.println("add sucess");
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void removePerson(People p) {
        String sql = "delete from people where Id = ?";
        try {
            connection = db.getConnection();
            stm = connection.prepareStatement(sql);
            stm.setInt(1, p.getId());
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(PeopelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public HashMap<Integer, People> getPeople() {
        String sql = "select * from people";
        HashMap<Integer, People> display = new HashMap<>();
        try {
            connection = db.getConnection();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                People p = new People();
                p.setId(rs.getInt("Id"));
                p.setName(rs.getString("name"));
                p.setGender(rs.getBoolean("Gender"));
                p.setDOB(rs.getDate("Dob"));
                display.put(rs.getInt("Id"), p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeopelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return display;
    }

}
