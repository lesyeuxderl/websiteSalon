<%-- 
    Document   : Halres
    Created on : Dec 7, 2019, 2:40:54 PM
    Author     : User
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservasi Antrian Salon</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <style>
            .tabel2{
                border: 2px solid;
/*                margin-top: 30px;
                margin-left: 100px;*/
                margin: 10px auto;
                width: 60%;
                
            }
            body, html {
                height: 100%;
            }
            .tombol{
                width: 90px;
                height: 40px;
                background-color: #e91e63;
                color: white;
                font-size: 20px;
                font-family: cursive;
            }
            .tombol:hover{
                background-color: grey;
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
            .tabelJadwal{
                border: 2px solid;
                margin: 30px 90px;
                text-align: center;
            }
            .jam{
                text-align: center;
            }
        </style>
    </head>
    <body>
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

        <!--header-->
        <div class="hero-image">
            <div class="hero-text">
                <h1>Reservasi</h1>
                <p><a href="HalamanAwal.html">Home</a>><a href="HalamanPms.html">Pemesanan</a>>Reservasi</p>   
            </div>
        </div>

        <!--content-->
        <div class="tabel2">
            <form name="form" method="GET" action = "reservasiServlet">
                <table rules="all" cellpadding="10px">
                    <tr>

                        <%
                            try {
                                String nama = session.getAttribute("uname").toString();
                                System.out.println(nama);
                                //deklarai
                                String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
                                Connection conn = null;
                                PreparedStatement ps = null;
                                ResultSet rs = null;
                                //loadJDBC
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                conn = DriverManager.getConnection(jdbcURL, "hr", "hr");
                                ps = conn.prepareStatement("select * from member where nama='" + nama + "'");
                                rs = ps.executeQuery();
                                if (rs.next()) {
                        %>
                        <td colspan="5" bgcolor="#e91e63" style="color:white">Nama : <%=rs.getString(2)%><br>Nomor Hp : <%=rs.getString(5)%> <br>Email :                             
                            <%=rs.getString(6)%></td>

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
                    <tr>
                        <td rowspan="6"><img src="reservasi.PNG"/><p>Catatan:<br>Jika ada perubahan silahkan hubungi admin</p></td>
                        <td height="20px" colspan="4">Tanggal Booking : 
                            <label value="tanggal">
                                <script>
                                    var tanggal = new Date();
                                    var hari = tanggal.getDay();
                                    var d = tanggal.getDate();
                                    var b = tanggal.getMonth();
                                    var y = tanggal.getYear();
                                    if (y < 1000) {
                                        y += 1900;
                                        if (d < 10) {
                                            d = "0" + d;
                                            var darr = new Array("Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu");
                                            var mar = new Array("Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember");
                                            document.write("" + darr[hari] + ", " + d + " " + mar[b] + " " + y + "");
                                        }
                                    }
                                </script>
                            </label></td>
                    </tr>
                    <tr>
                        <td class ="jam" width="25%" colspan="2">
                            Jam</td>
                        <td>Tempat Tersedia</td>
                        <td>Pilih</td>
                    </tr>
                    
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
                            ps = conn.prepareStatement("select * from jadwal where kuota not like '0'");
                            rs = ps.executeQuery();

                            while (rs.next()) {
                    %>   
                    <tr>    
                        <td class="jam" colspan="2"><%=rs.getString(2)%></td>
                        <td class="jam"><%=rs.getString(3)%>/5</td>
                        <td><input type ="radio" name="pilih" value="<%=rs.getString(1)%>"/></td>
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
                    <tr>
                        <td colspan="6" align="right"><input type="submit" onclick="Back()" name="kembali" class="tombol" value="Kembali"/>
                            <input type="submit" name="booking" class="tombol" value="Booking"/></td>
                    </tr>
                </table></form>
        </div>
        

        <script>
            function Back() {
                document.form.action = "HalamanPms.html";
                form.submit();
            }
        </script>
    </body>
</html>
