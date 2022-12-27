/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc;

import Data.sqlconnector;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author duynh
 */
public class acc {
    int id;
    String username;

    public acc() {
    }

    public acc(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
       
}
