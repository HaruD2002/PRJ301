package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Account</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background: #81ecec;\n");
      out.write("            }\n");
      out.write("            .createacc-container{\n");
      out.write("                display: table;\n");
      out.write("                border: white solid 0.1rem;\n");
      out.write("                background: white;\n");
      out.write("                position: fixed;\n");
      out.write("                top:5%;\n");
      out.write("                left:29%;\n");
      out.write("                right:35%;\n");
      out.write("                justify-content: center;               \n");
      out.write("                flex-direction: column;\n");
      out.write("                min-height: auto;\n");
      out.write("                height: 80vh;\n");
      out.write("                width: 40rem;\n");
      out.write("                border-radius: 1rem;\n");
      out.write("                box-shadow: 5px 10px 8px #888888 ;\n");
      out.write("            }\n");
      out.write("            .createacc-title{\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("                font-weight: 900;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                padding-top: 5%;\n");
      out.write("                margin-left: 11%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            tr.spaceUnder>td {\n");
      out.write("                padding-bottom: 1em;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .display{\n");
      out.write("                font-size: 1rem;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
      out.write("             input[type=text]{\n");
      out.write("                width:95%;\n");
      out.write("                font-size: 1em;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=password]{\n");
      out.write("                width: 85%;\n");
      out.write("                font-size: 1em;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("            } \n");
      out.write("            input[type = submit]{\n");
      out.write("                background-color: #0984e3;\n");
      out.write("                border-radius: 0.4rem;\n");
      out.write("                font-size:1.5em;\n");
      out.write("                color:white;\n");
      out.write("                width:70%;\n");
      out.write("                margin-left:20%;\n");
      out.write("                margin-right:25%;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("                margin-left: 120%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            a:visited \n");
      out.write("            {\n");
      out.write("                text-decoration: none; \n");
      out.write("                decoration: none; \n");
      out.write("            }\n");
      out.write("            a:hover{\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("function myFunction() {\n");
      out.write("  var x = document.getElementById(\"myInput\");\n");
      out.write("  if (x.type === \"password\") {\n");
      out.write("    x.type = \"text\";\n");
      out.write("  } else {\n");
      out.write("    x.type = \"password\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class =\"createacc-container\">\n");
      out.write("            <div class =\"createacc-title\">\n");
      out.write("                <h1>Create Account </h1>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <form  action = \"checkCreate\" method =\"POST\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr class =\"spaceUnder\"> \n");
      out.write("                            <td><h2 class =\"display\">Enter New UserName </h2></td>\n");
      out.write("                            <td><input type=\"text\" name = \"userfname\" placeholder=\"First Name\"/></td>\n");
      out.write("                            <td><input type=\"text\" name = \"userlname\" placeholder=\"Last Name\"/>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr class =\"spaceUnder\">\n");
      out.write("                            <td><h2 class =\"display\">Gender </h2></td>\n");
      out.write("                            <td><select name = \"getme\">\n");
      out.write("                                    <option>Male</option>   \n");
      out.write("                                    <option>Female</option>   \n");
      out.write("                                </select></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr class =\"spaceUnder\">\n");
      out.write("                            <td><h2 class =\"display\"> Date of Birth</h2> </td>\n");
      out.write("                            <td><input type=\"date\" name=\"uOB\" placeholder=\"EnterDOB\"/>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><h2 class =\"display\">Enter your Email</h2></td>\n");
      out.write("                            <td><input type=\"text\" name = \"uEmail\" placeholder=\"Enter Your Email Here\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr class =\"spaceUnder\">\n");
      out.write("                            <td><h2 class =\"display\">Enter your UserName</h2></td>\n");
      out.write("                            <td><input type=\"text\" name = \"username\" placeholder=\"Enter Your UserName Here\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr class =\"spaceUnder\">\n");
      out.write("                            <td><h2 class =\"display\">Enter your Password</h2></td>\n");
      out.write("                            <td><input type=\"password\" name = \"uPass\" placeholder=\"Enter Your Password Here\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr class =\"spaceUnder\">\n");
      out.write("                            <td><input type=\"submit\" name = \"createUser\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr class =\"spaceUnder lacc\">\n");
      out.write("                            <td><a href = \"/MyPage/signin.jsp\">Already had account?</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                       \n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
