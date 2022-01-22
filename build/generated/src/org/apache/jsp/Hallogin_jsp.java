package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Hallogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login JSP</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sweetalert.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"sweetalert.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            .tulisan_login{\n");
      out.write("                text-align: center;\n");
      out.write("                color: black;\n");
      out.write("                /*membuat semua huruf menjadi kapital*/\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .kotak_login{\n");
      out.write("                width: 400px;\n");
      out.write("                height: 350px;\n");
      out.write("                /*background-color: #e91e63;*/\n");
      out.write("                background-color: white;\n");
      out.write("                color: black;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                border: 5px solid white;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 150px;\n");
      out.write("                left: 60%;\n");
      out.write("                padding: 20px;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label{\n");
      out.write("                font-size: 11pt;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form_login{\n");
      out.write("                /*membuat lebar form penuh*/\n");
      out.write("                /*box-sizing : border-box;*/\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tombol_login{\n");
      out.write("                background: crimson;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("            }\n");
      out.write("            .tombol_login:hover{\n");
      out.write("                background: pink;\n");
      out.write("                color: black;\n");
      out.write("            } \n");
      out.write("            .link{\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 10pt;\n");
      out.write("            }\n");
      out.write("            .link:hover{\n");
      out.write("                color: #e91e63;\n");
      out.write("            }\n");
      out.write("            .kotak{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                background: url('salon.jpg') no-repeat  fixed;\n");
      out.write("                background-size:100% 100%;         \n");
      out.write("                color: white;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                position: absolute;             \n");
      out.write("                padding: 10px;\n");
      out.write("                opacity: 0.8;              \n");
      out.write("            }\n");
      out.write("            .kotak2{\n");
      out.write("                width: 600px;\n");
      out.write("                height: 250px;\n");
      out.write("                background-color: #e91e63;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                border: 5px solid white;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 200px;             \n");
      out.write("                padding: 5px 20px;\n");
      out.write("                opacity: 0.9;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .para{\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            /*alert*/\n");
      out.write("            .bg-modal{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 235%;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.7);\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                /*align-items: center;*/\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .modal-content{\n");
      out.write("                top: 70px;\n");
      out.write("                width: 400px;\n");
      out.write("                height: 200px;\n");
      out.write("                background-color: white;\n");
      out.write("                opacity: 1;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .btnTidak{\n");
      out.write("                width: 20%;\n");
      out.write("                position: relative;\n");
      out.write("                background-color: crimson;\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .btnIya{\n");
      out.write("                width: 20%;\n");
      out.write("                background-color: green;\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .tutup{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                right: 10px;\n");
      out.write("                font-size: 35px;\n");
      out.write("                transform: rotate(45deg);\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar (sit on top) -->\n");
      out.write("        <div class=\"w3-top\">\n");
      out.write("            <div class=\"w3-bar w3-pink w3-padding w3-card\" style=\"letter-spacing:4px;\">\n");
      out.write("                <a href=\"HalamanAwal.html\" class=\"w3-bar-item w3-button\">Noto Salon</a>\n");
      out.write("                <!-- Right-sided navbar links. Hide them on small screens -->\n");
      out.write("                <div class=\"w3-right w3-hide-small\">\n");
      out.write("                    <a href=\"HalamanLogin.html\" class=\"w3-bar-item w3-button\">Login</a>\n");
      out.write("                    <a href=\"HalamanSignUp.html\" class=\"w3-bar-item w3-button\">Sign Up</a>\n");
      out.write("                    <a href=\"#contact\" class=\"w3-bar-item w3-button\">Contact</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"kotak\"></div>\n");
      out.write("        <div class=\"kotak2\">\n");
      out.write("            <h1>Selamat Datang</h1>\n");
      out.write("            <p class=\"para\">\n");
      out.write("                Silahkan login terlebih dahulu agar dapat menikmati layanan dari salon kami<br>\n");
      out.write("                Jika belum punya akun silahkan tekan sign up untuk menjadi member</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Bagian kotak-->\n");
      out.write("        <div class=\"kotak_login\">\n");
      out.write("            <p class=\"tulisan_login\">login</p>\n");
      out.write("            <form method=\"POST\" action=\"loginServlet\">\n");
      out.write("                <label>Username</label>\n");
      out.write("                <input type=\"text\" id =\"nama\" name=\"username\" class=\"form_login\" placeholder=\"Masukan email\" required=\"\"/>\n");
      out.write("                <label>Password</label>\n");
      out.write("                <input type=\"password\" id =\"pass\" name=\"pw\" class=\"form_login\" placeholder=\"Password\" required=\"\"/>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" id=\"log\" class=\"tombol_login\" value=\"LOGIN\">\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <center>\n");
      out.write("                    <a class=\"link\" href=\"HalamanSignUp.html\">Sign Up</a>\n");
      out.write("                </center>\n");
      out.write("            </form>\t\t\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"bg-modal\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"tutup\">+</div>\n");
      out.write("                <h3>Username dan Password Salah</h3>\n");
      out.write("                <button onclick=\"gajadi()\" class=\"btnTidak\">Ok</button>\n");
      out.write("                <!--<button class=\"btnIya\">Yes</button>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hasil == 'true'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(") {\n");
      out.write("            alert(\"sdgyufutftfadsa\");\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
