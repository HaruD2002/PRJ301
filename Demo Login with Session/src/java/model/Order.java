/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author sonnt
 */
public class Order {
    private int id;
    private Date date;
    ArrayList<OrderLine> lines = new ArrayList<>();
    
    public float getTotal()
    {
        float sum = 0;
        for (OrderLine line : lines) {
            sum += line.getQuantity() * line.getUnitprice();
        }
        return sum;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<OrderLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<OrderLine> lines) {
        this.lines = lines;
    }
}
