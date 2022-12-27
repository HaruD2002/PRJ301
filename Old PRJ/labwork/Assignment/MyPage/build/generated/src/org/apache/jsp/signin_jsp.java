package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sign Page</title>\n");
      out.write("        <style> \n");
      out.write("            body{\n");
      out.write("                background: #81ecec;\n");
      out.write("            }\n");
      out.write("            .login-container{\n");
      out.write("                display: block;\n");
      out.write("                border: white solid 0.1rem;\n");
      out.write("                background: white;\n");
      out.write("                position: fixed;\n");
      out.write("                top:15%;\n");
      out.write("                left:37%;\n");
      out.write("                right:35%;\n");
      out.write("                justify-content: center;\n");
      out.write("                height: 30rem;\n");
      out.write("                width: 25rem;\n");
      out.write("                border-radius: 1rem;\n");
      out.write("                box-shadow: 5px 10px 8px #888888 ;\n");
      out.write("            }\n");
      out.write("            .login-title{\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("                font-weight: 900;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1,h3{ \n");
      out.write("                font-weight: 500;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
      out.write("            .login-detail{\n");
      out.write("                display: block;\n");
      out.write("                margin-left: 10%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=text]{\n");
      out.write("                width: 85%;\n");
      out.write("                font-size: 1em;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=password]{\n");
      out.write("                width: 85%;\n");
      out.write("                font-size: 1em;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type = submit]{\n");
      out.write("                background-color: #0984e3;\n");
      out.write("                border-radius: 0.4rem;\n");
      out.write("                font-size:1.5em;\n");
      out.write("                color:white;\n");
      out.write("                width:50%;\n");
      out.write("                margin-left:20%;\n");
      out.write("                margin-right:25%;\n");
      out.write("                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
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
      out.write("        <script>\n");
      out.write("            function showPass() {\n");
      out.write("                var x = document.getElementById(\"show\");\n");
      out.write("                if (x.type === \"password\") {\n");
      out.write("                    x.type = \"text\";\n");
      out.write("                } else {\n");
      out.write("                    x.type = \"password\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class = \"login-container\">\n");
      out.write("            <div class = \"login-title\">\n");
      out.write("                <h1>LOG IN</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class = \"login-detail\">\n");
      out.write("                <form action = \"checkvalid\" method = \"post\">\n");
      out.write("                    <h3>Enter Email or UserName</h3>\n");
      out.write("                    <input type =\"text\" name = \"user\"/>\n");
      out.write("                    <h3>Enter password </h3>\n");
      out.write("                    <input type =\"password\" name =\" pass\" id = \"show\"/><br><br>\n");
      out.write("                    <input type=\"checkbox\" onclick=\"showPass()\">Show Password <br><br>\n");
      out.write("                    <lable><input type =\"checkbox\" value= \"Remembe\" name =\"remember\"/>Remeber me</lable>\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <input type =\"submit\" value =\"Log in\" name =\"login\"/>\n");
      out.write("                </form>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Accountalert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <div>\n");
      out.write("                    <a href = \"createaccount.jsp\">Do not have an account yet?Create now </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
