package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Employee;
import java.util.ArrayList;
import model.Name;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>3 value String </h1>\n");
      out.write("         ");
    
        try{
           String []displayA = (String[]) session.getAttribute("firstString");
           for (int i = 0; i < displayA.length ; i++) {
                   out.println("<h2>" + displayA[i] + "</h2> ");
               }
        }catch(Exception e){
                    out.println(e);
        } 
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1> String Name</h1>\n");
      out.write("        ");

    try{
            Name []displayB = (Name[])session.getAttribute("secondString");
            
            for (int i = 0; i < displayB.length; i++) {
                out.println("<h2>" + displayB[i].getFirstname() + " "+displayB[i].getLastname() + "</h2>");
                
              }
            
    }catch(NullPointerException e){
        out.println(e);
    } 
    
      out.write("\n");
      out.write("    <h1>ArrayList Name</h1>\n");
      out.write("    ");

    try{
        ArrayList<Name> displayC = (ArrayList) session.getAttribute("thirdString");
        
        for(Name c : displayC){
              out.println("<h2>" + c.getFirstname()+ " "+ c.getLastname()+ "</h2>");
        }
    
    }catch(NullPointerException e){
        out.println(e);
    }    

        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1> Employee </h1>\n");
      out.write("        ");

        ArrayList<Employee> displayD = (ArrayList) session.getAttribute("lastString");
        
            for(Employee d : displayD){
             out.println("<h2>" + d.getFirstName()+ " "+ d.getLastName() + " " + d.getAddress() + " " + d.getCity() + " " + d.getZip() + " " + "</h2>");
            
            }
        
        
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
