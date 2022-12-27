/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.sql.Date;

/**
 *
 * @author duynh
 */
public class TimeSheet {
    private int sid;
    private Employee e;
    private Date currentDate;
    private Date morningcheckin;
    private Date afternooncheckin;

    public TimeSheet() {
    }

    public TimeSheet(int sid, Employee e, Date currentDate, Date morningcheckin, Date afternooncheckin) {
        this.sid = sid;
        this.e = e;
        this.currentDate = currentDate;
        this.morningcheckin = morningcheckin;
        this.afternooncheckin = afternooncheckin;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getMorningcheckin() {
        return morningcheckin;
    }

    public void setMorningcheckin(Date morningcheckin) {
        this.morningcheckin = morningcheckin;
    }

    public Date getAfternooncheckin() {
        return afternooncheckin;
    }

    public void setAfternooncheckin(Date afternooncheckin) {
        this.afternooncheckin = afternooncheckin;
    }
    
    
}
