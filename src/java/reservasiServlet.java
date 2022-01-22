/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Database.KoneksiDatabase;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import jdbcClient.SalonWs_Service;

/**
 *
 * @author User
 */
public class reservasiServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9090/SalonWs/SalonWs.wsdl")
    private SalonWs_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet reservasiServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet reservasiServlet at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date date = new Date();
        String tanggal = sdf.format(date);
        String idmember = "";
        String idJadwal = request.getParameter("pilih");
        cekKuota(idJadwal);
        try {
            HttpSession session = request.getSession();
            String nama = session.getAttribute("uname").toString();
            KoneksiDatabase kd = new KoneksiDatabase();
            PreparedStatement ps = kd.getConnection().prepareStatement("select * from member where nama='" + nama + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idmember = rs.getString(1);
            }
            rs.close();
            ps.close();
            kd.getClosed();
            tambahAntrian(idmember, idJadwal, tanggal);
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<script>");
            out.println("alert('Booking Berhasil');");
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
            RequestDispatcher rd = request.getRequestDispatcher("HalamanPms.html");
            rd.include(request, response);
//            response.sendRedirect("HalamanPms.html");
        } catch (Exception e) {
            out.println("Gagal booking");
        }

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
//        processRequest(request, response);
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

    private String tambahAntrian(java.lang.String idMember, java.lang.String idJadwal, java.lang.String tanggal) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        jdbcClient.SalonWs port = service.getSalonWsPort();
        return port.tambahAntrian(idMember, idJadwal, tanggal);
    }

    private Integer cekKuota(java.lang.String idjadwal) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        jdbcClient.SalonWs port = service.getSalonWsPort();
        return port.cekKuota(idjadwal);
    }

}
