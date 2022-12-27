/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Employee;
import modal.Team;
import modal.TimeSheet;
import java.sql.Date;


/**
 *
 * @author duynh
 */
public class AccountDBcontext extends DBcontext {

    public ArrayList<Employee> getEmployee() {
        String sql = "select e.empid as 'empid',e.empname as 'empname',e.gender as 'empgender',te.teamName as 'Empteam',ti.possitionid as 'teamPosition',\n"
                + "t.checkindate as 'currentdate',t.checkinmorning as 'MorningCheck',t.checkinafternoon as 'AfternoonCheck'\n"
                + "from empinfo e \n"
                + "inner join timesheet t \n"
                + "on e.empid = t.empid\n"
                + "inner join teaminfo ti \n"
                + "on e.empid = ti.memberid\n"
                + "inner join team te \n"
                + "on ti.teamids = te.teamid\n"
                + "order by currentdate asc,ti.teamids asc";
        ArrayList<Employee> getAllEmployeeinfo = new ArrayList<>();
        ArrayList<TimeSheet> getAllEmpTime = new ArrayList<>();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpid(rs.getInt("empid"));
                e.setEmpname(rs.getString("empname"));
                Team t = new Team();
                t.setTeamname(rs.getString("Empteam"));
                t.setPossition(rs.getInt("teamPosition"));
                e.setCurrenteam(t);
                TimeSheet ts = new TimeSheet();
                ts.setCurrentDate(rs.getDate("currentdate"));
                if(rs.getDate("MorningCheck") == null){
                    ts.setMorningcheckin(Date.valueOf("1-1-1991"));
                }else{
                ts.setAfternooncheckin(rs.getDate("MorningCheck"));              
                }
                if(rs.getDate("AfternoonCheck") == null){
                    ts.setMorningcheckin(Date.valueOf("1-1-1991"));
                }else{
                ts.setAfternooncheckin(rs.getDate("AfternoonCheck"));              
                }
               
                getAllEmpTime.add(ts);
                e.setTimesheet(getAllEmpTime);
                getAllEmployeeinfo.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getAllEmployeeinfo;
    }

    public ArrayList<Employee> getAllEmployee() {
        String sql = "select e.empid as 'empid',e.empname as 'empname',t.teamName as 'team',ti.possitionid as 'position' from empinfo e\n"
                + "inner join teaminfo ti\n"
                + "on e.empid = ti.memberid\n"
                + "inner join team t\n"
                + "on t.teamid = ti.teamids";
        ArrayList<Employee> getList = new ArrayList<>();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpid(rs.getInt("empid"));
                e.setEmpname(rs.getString("empname"));
                Team t = new Team();
                t.setTeamname(rs.getString("team"));
                t.setPossition(rs.getInt("position"));
                e.setCurrenteam(t);
                getList.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getList;
    }

    public static void main(String[] args) {
        AccountDBcontext db = new AccountDBcontext();
        ArrayList<Employee> display = db.getAllEmployee();
        for (Employee e : display) {
            System.out.println(e.getEmpname());
            System.out.println(e.getCurrenteam().getTeamname());
            System.out.println(e.getTimesheet().get(0).getCurrentDate());

        }
    }
}
