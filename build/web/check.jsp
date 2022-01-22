<%-- 
    Document   : check
    Created on : Dec 8, 2019, 12:04:48 AM
    Author     : User
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check</title>
        <link rel="stylesheet" type="text/css" href="sweetalert.css">
        <script type="text/javascript" src="sweetalert.js"></script>
    </head>
    <body>
    
    </body>-->
       <%
            String action = request.getParameter("action");
            if (action.equals("login")) {
                String nama = request.getParameter("nama");
                String pw = request.getParameter("password");

                //deklarai
                String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
                Connection conn = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                //loadJDBC
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conn = DriverManager.getConnection(jdbcURL, "hr", "hr");
                    ps = conn.prepareStatement("select * from member where nama='" + nama + "' and password='" + pw + "'");
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("swal('Good Job', 'You clicked the button!', 'success')");
                        out.println("</script>");
                        response.sendRedirect("HalamanPms.html");
                    } else {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Username dan Password tidak cocok');");
                        out.println("location='HalamanLogin.html';");
                        out.println("</script>");

                    }

                } catch (Exception e) {
                    System.out.println("Error message : " + e.getMessage());
                }
            }
        %>
<!--</html>-->

