/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Employee;
import modal.Team;
import modal.TimeSheet;

/**
 *
 * @author duynh
 */
public class TimeSheetController extends DBcontext {

    public ArrayList<TimeSheet> getEmployee() {
        String sql = "select e.empid as 'empid',t.checkindate as 'currentdate',t.checkinmorning "
                + "as 'MorningCheck',t.checkinafternoon as 'AfternoonCheck'\n"
                + "from timesheet t \n"
                + "inner join empinfo e \n"
                + "on e.empid = t.empid\n"
                + "order by currentdate asc";
        ArrayList<TimeSheet> getAllEmpTime = new ArrayList<>();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                TimeSheet ts = new TimeSheet();
                ts.setCurrentDate(rs.getDate("currentdate"));
                if (rs.getDate("MorningCheck") == null || rs.getDate("MorningCheck").equals("")) {
                    ts.setMorningcheckin(null);
                } else {
                    ts.setAfternooncheckin(rs.getDate("MorningCheck"));
                }
                if (rs.getDate("AfternoonCheck") == null || rs.getDate("AfternoonCheck").equals("")) {
                    ts.setMorningcheckin(Date.valueOf("1-1-1991"));
                } else {
                    ts.setAfternooncheckin(rs.getDate("AfternoonCheck"));
                }

                getAllEmpTime.add(ts);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getAllEmpTime;

    }

    public static void main(String[] args) {
        TimeSheetController db = new TimeSheetController();
        ArrayList<TimeSheet> s = db.getEmployee();
        for(TimeSheet t :s){
            System.out.println(t);
        }
    }
}
