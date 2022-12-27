/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import acc.acc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author duynh
 */
public class myQueury {
    public static ArrayList<acc> getAll(){
        ArrayList<acc> lsit = new ArrayList<>();
        
        String selectall = "Select * from DummyTBL";
        
        try{
            Connection con = sqlconnector.connectDatabase();
            Statement sm  = con.createStatement();
            ResultSet rs = sm.executeQuery(selectall);
            
            while(rs.next()){
                lsit.add(new acc(rs.getInt("id"), rs.getString("name")));
            }           
        }catch(Exception e){
            
        }
        
        return lsit;
    
    }
    public static int getTotal(){
     String queury = "select count(*) from DummyTBL";
     try{
         Connection con = sqlconnector.connectDatabase();
         Statement sm  = con.createStatement();
         ResultSet rs = sm.executeQuery(queury);
         while(rs.next()){
             return rs.getInt(1);
         }
     }catch(Exception e){
     } 
     return 0;
    }
        
    
}
