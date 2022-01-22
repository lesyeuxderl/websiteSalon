<%-- 
    Document   : Hallogin
    Created on : Dec 7, 2019, 11:30:19 PM
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
        <title>Login JSP</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" type="text/css" href="sweetalert.css">
        <script type="text/javascript" src="sweetalert.js"></script>
        <style>
            body{
                font-family: sans-serif;
            }
            .tulisan_login{
                text-align: center;
                color: black;
                /*membuat semua huruf menjadi kapital*/
                text-transform: uppercase;
            }

            .kotak_login{
                width: 400px;
                height: 350px;
                /*background-color: #e91e63;*/
                background-color: white;
                color: black;
                border-radius: 4px;
                border: 5px solid white;
                position: absolute;
                top: 150px;
                left: 60%;
                padding: 20px;
                opacity: 0.9;
            }

            label{
                font-size: 11pt;
            }

            .form_login{
                /*membuat lebar form penuh*/
                /*box-sizing : border-box;*/
                width: 100%;
                padding: 10px;
                font-size: 11pt;
                margin-bottom: 20px;
            }

            .tombol_login{
                background: crimson;
                color: white;
                font-size: 11pt;
                width: 100%;
                border: 1px solid white;
                border-radius: 3px;
                padding: 10px 20px;
            }
            .tombol_login:hover{
                background: pink;
                color: black;
            } 
            .link{
                color: black;
                text-decoration: none;
                font-size: 10pt;
            }
            .link:hover{
                color: #e91e63;
            }
            .kotak{
                width: 100%;
                height: 100%;
                background: url('salon.jpg') no-repeat  fixed;
                background-size:100% 100%;         
                color: white;
                border-radius: 4px;
                position: absolute;             
                padding: 10px;
                opacity: 0.8;              
            }
            .kotak2{
                width: 600px;
                height: 250px;
                background-color: #e91e63;
                color: white;
                border-radius: 4px;
                border: 5px solid white;
                position: absolute;
                top: 200px;             
                padding: 5px 20px;
                opacity: 0.9;

            }
            .para{
                font-size: 18px;
            }
            /*alert*/
            .bg-modal{
                width: 100%;
                height: 235%;
                background-color: rgba(0, 0, 0, 0.7);
                position: absolute;
                top: 0;
                display: flex;
                justify-content: center;
                /*align-items: center;*/
                display: none;
            }
            .modal-content{
                top: 70px;
                width: 400px;
                height: 200px;
                background-color: white;
                opacity: 1;
                border-radius: 4px;
                text-align: center;
                padding: 20px;
                position: relative;
            }
            .btnTidak{
                width: 20%;
                position: relative;
                background-color: crimson;
                color: white;
                cursor: pointer;
            }
            .btnIya{
                width: 20%;
                background-color: green;
                color: white;
                cursor: pointer;
            }
            .tutup{
                position: absolute;
                top: 0;
                right: 10px;
                font-size: 35px;
                transform: rotate(45deg);
                cursor: pointer;
            }

        </style>
    </head>

    <body>
        <!-- Navbar (sit on top) -->
        <div class="w3-top">
            <div class="w3-bar w3-pink w3-padding w3-card" style="letter-spacing:4px;">
                <a href="HalamanAwal.html" class="w3-bar-item w3-button">Noto Salon</a>
                <!-- Right-sided navbar links. Hide them on small screens -->
                <div class="w3-right w3-hide-small">
                    <a href="HalamanLogin.html" class="w3-bar-item w3-button">Login</a>
                    <a href="HalamanSignUp.html" class="w3-bar-item w3-button">Sign Up</a>
                    <a href="#contact" class="w3-bar-item w3-button">Contact</a>
                </div>
            </div>
        </div>


        <div class="kotak"></div>
        <div class="kotak2">
            <h1>Selamat Datang</h1>
            <p class="para">
                Silahkan login terlebih dahulu agar dapat menikmati layanan dari salon kami<br>
                Jika belum punya akun silahkan tekan sign up untuk menjadi member</p>
        </div>



        <!--Bagian kotak-->
        <div class="kotak_login">
            <p class="tulisan_login">login</p>
            <form method="POST" action="loginServlet">
                <label>Username</label>
                <input type="text" id ="nama" name="username" class="form_login" placeholder="Masukan email" required=""/>
                <label>Password</label>
                <input type="password" id ="pass" name="pw" class="form_login" placeholder="Password" required=""/>

                <input type="submit" id="log" class="tombol_login" value="LOGIN">
                <br/>
                <br/>
                <center>
                    <a class="link" href="HalamanSignUp.html">Sign Up</a>
                </center>
            </form>		
        </div>

        <div class="bg-modal">
            <div class="modal-content">
                <div class="tutup">+</div>
                <h3>Username dan Password Salah</h3>
                <button onclick="gajadi()" class="btnTidak">Ok</button>
                <!--<button class="btnIya">Yes</button>-->
            </div>
        </div>
        <script>
        if (${hasil == 'true'}) {
            alert("sdgyufutftfadsa");
        }
        </script>
    </body>

</html>
