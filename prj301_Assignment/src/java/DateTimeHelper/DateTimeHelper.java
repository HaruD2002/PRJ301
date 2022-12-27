/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTimeHelper;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Ngo Tung Son
 */
public class DateTimeHelper {
    public static Date addDays(Date date, int days)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        Date d = c.getTime();
        return d;
    }
    
    public static Date addMonths(Date date, int months)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, months);
        Date d = c.getTime();
        return d;
    }
    
    public static Date removeTime(Date date)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }
    
    public static float diffHours(Date end, Date start)
    {
       long diff = end.getTime() - start.getTime();
       float hours = ((diff/1000)*(1.0f))/3600;
       return hours;
    }
    
    public static int getDayOfMonth(Date date)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }
    
    public static int getDayOfWeek(Date date)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_WEEK);
    }
    
    public static Timestamp getTimeStamp(Date data)
    {
        return new Timestamp(data.getTime());
    }
    
    public static ArrayList<Date> getDates(Date from, Date to)
    {
        ArrayList<Date> dates = new ArrayList<>();
        int day =0;
        while(true)
        {
            Date d = addDays(from, day);
            day++;
            dates.add(d);
            if(d.getTime() - to.getTime() == 0)
                break;
        }
        return dates;
    }
    
}
