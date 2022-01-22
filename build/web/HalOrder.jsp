<%-- 
    Document   : HalOrder
    Created on : Dec 6, 2019, 11:11:59 PM
    Author     : User
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Halaman Order JSP</title>
        <style>
            .tabel1{
                border: 2px solid;
                margin: 30px 90px;  
            }
            .tombol{
                width: 100px;
                height: 40px;
                background-color: crimson;
                color: white;
                font-size: 20px;
                font-family: cursive;
            }
            .tombol:hover{
                background-color: grey;
            }
            .gambar{
                width: 100px;
                border-radius: 50%;
            }  
            body, html {
                height: 120%;
            }
            /* The hero image */
            .hero-image {
                /* Use "linear-gradient" to add a darken background effect to the image (photographer.jpg). This will make the text easier to read */
                background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("salon.jpg");

                /* Set a specific height */
                height: 50%;

                /* Position and center the image to scale nicely on all screens */
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
                position: relative;
            }

            /* Place text in the middle of the image */
            .hero-text {
                text-align: center;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                color: white;
            }
        </style>
    </head>
    <body>
        <!--navbar-->
        <div class="w3-top">
            <div class="w3-bar w3-pink w3-padding w3-card" style="letter-spacing:4px;">
                <a href="HalamanAwal.html" class="w3-bar-item w3-button">Noto Salon</a>
                <!--Right-sided navbar links. Hide them on small screens--> 
                <div class="w3-right w3-hide-small">
                    <a href="#" class="w3-bar-item w3-button">Logout</a>
                    <a href="#contact" class="w3-bar-item w3-button">Contact</a>
                </div>
            </div>
        </div>

        <div class="hero-image">
            <div class="hero-text">
                <h1>Order</h1>
                <p><a href="HalamanAwal.html">Home</a>><a href="HalamanPms.html">Pemesanan</a>>Order</p>   
            </div>
        </div>

        <!--content-->
        <div id ="tabel" class="tabel1">
            <center>
                <table rules="all" cellpadding="10px">
                    <tr>
                        <td colspan="3" bgcolor="#e91e63">Nama : <br>Nomor Hp : <br>Email :</td>      
                    </tr>

                    <tr>
                        <td>Alamat Pemesanan</td>
                        <td bgcolor="pink" colspan="20">Layanan yang dipilih</td>
                        <td bgcolor="pink" colspan="10">Harga(IDR)</td>
                    <tr>
                        <td rowspan="8"><textarea rows="10" cols="10"></textarea></td>

                        <!--                        <td> <table border="1px">
                                                <th>Nama jasa</th>
                                                <th>Harga</th>-->
                    </tr>
<!--                                        <tr>
                                            <td colspan="1"><img src="jasaimg/semir.png" class="gambar">
                                        </tr>
                                        <tr>
                                            <td colspan="1"><img src="jasaimg/makeup.jpg" class="gambar">
                                        </tr>
                                        <tr>
                                            <td colspan="1"><img src="jasaimg/bodym.jpg" class="gambar">
                                        </tr>
                                        <tr>
                                            <td colspan="1"><img src="jasaimg/meni.jpg" class="gambar">
                                        </tr>
                                        <tr>
                                            <td colspan="1"><img src="jasaimg/pedi.jpg" class="gambar">
                                        </tr>
                                        <tr>
                                            <td colspan="1"><img src="jasaimg/facial.jpg" class="gambar">
                                        </tr>-->


                    <%
                        try {
                            //deklarai
                            String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
                            Connection conn = null;
                            PreparedStatement ps = null;
                            ResultSet rs = null;
                            //loadJDBC
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            conn = DriverManager.getConnection(jdbcURL, "hr", "hr");
                            ps = conn.prepareStatement("select * from jasa");
                            rs = ps.executeQuery();

                            while (rs.next()) {
                    %>               


                    <tr>    
                       
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><input type ="checkbox" name="pilih" value="<%=rs.getString(1)%>"/></td>
                    </tr>

                    <%
                        }
                    %>
                    <%
                            //menutup koneksi
                            rs.close();
                            ps.close();
                            conn.close();

                        } catch (Exception e) {
                            System.out.println("Error " + e.getMessage());
                        }
                    %>
                    </tr>
                </table></td>
                <tr>
                    <td colspan="4" align="right"><input type="submit" onclick="Back()" name="kembali" class="tombol" value="Kembali"/> 
                        <input type="submit" name="order" class="tombol" value="Order"/> </td>
                </tr>
                </table>
            </center>
        </div>
        <script>
            function Back() {
                document.form.action = "HalamanPms.html";
                form.submit();
            }
        </script>
    </body>
</html>
