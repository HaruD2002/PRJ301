/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author duynh
 */
public class DateFormat extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
       private Date Date;

   public Date getDate() {
       return Date;
   }

   public void setValue(Date Date) {
       this.Date = Date;
   }    
   
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
         String pattern = "dd-MM-yyyy";
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
       String v = simpleDateFormat.format(Date);
       String[] values = v.split("-");
       
        JspWriter out = getJspContext().getOut();
       out.println(Date[Z0] + "/" + Date[1]+ "/" + Date[2]); 
       
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }
    
}
