/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author duynh
 */
public class Account  extends BaseModel{
    private String username;
    private String password;
    private String displaynaem;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplaynaem() {
        return displaynaem;
    }

    public void setDisplaynaem(String displaynaem) {
        this.displaynaem = displaynaem;
    }
    
    
}
