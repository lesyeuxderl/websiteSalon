/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class loginServlet extends HttpServlet {

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet loginServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String nama = request.getParameter("username");
        String pass = request.getParameter("pw");
        HttpSession session = request.getSession(true);
        try {
            if (nama != null) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
                System.out.println("Koneksi berhasil");
                String query = "select * from member where nama='" + nama + "' and password='" + pass + "'";
                String queryA = "select * from admin where namaAdmin='" + nama + "' and password='" + pass + "'";
                PreparedStatement psm = conn.prepareStatement(query);
                PreparedStatement psm2 = conn.prepareStatement(queryA);
                ResultSet rs = psm.executeQuery();
                ResultSet rs2 = psm2.executeQuery();
                if (rs.next()) {
                    session.setAttribute("uname", nama);
                    response.sendRedirect("HalamanPms.html");
                }if (rs2.next()) {
                    session.setAttribute("uname", nama);
                    response.sendRedirect("HalamanAdmin.html");
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Username atau password salah');");
                    out.println("location='HalamanLogin.html';");
                    out.println("</script>");
//                    RequestDispatcher rd = request.getRequestDispatcher("HalamanLogin.html");
//                    rd.include(request, response);
                }
                rs.close();
                psm.close();
                conn.close();
                rs2.close();
                psm2.close();

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
