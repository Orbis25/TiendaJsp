

<%@page import="com.Bean.User"%>
<%
User usu = new User();
HttpSession sesionOK = request.getSession();
if(sesionOK.getAttribute("usuario")!=null){
usu = (User) sesionOK.getAttribute("usuario");
}
%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no , initial-scale=1.0, maximum-scale=1.0,minimum-scale=1.0">

    <!--===============================================================================================-->
    <link rel="icon" href="img/laptop.ico" />
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="css/utillogin.css">
    <link rel="stylesheet" type="text/css" href="css/mainlogin.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Confirmacion Correo</title>
</head>

<body class="body-alert">

    <div class="container">
        <div class="row justify-content-center mt-5 ">
            <div class="col-8 bg-light alert">
                <h4 class="alert-heading  bg-heading"> Gracias por su Compra!
                </h4>
                <p>Dirigete a tu correo y ahi estara la factura para que al momento de llegarte el envio la presentes, Gracias!
                    <span class="fa fa-shopping-cart "></span>
                </p>
                <hr>
                <div class="row justify-content-center">
                        <div class="col-5">
                        <span class="fa fa-shopping-cart"></span>
                        <a href="index.jsp" class="mt-4">Seguir Comprando</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script type="js/jquery-3.3.1.min.js"></script>
    <script type="js/bootstrap.min.js"></script>

</body>

</html>