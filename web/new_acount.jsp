<!DOCTYPE html>
<html lang="en">

<head>
    <title>Registro</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
    <!--===============================================================================================-->
</head>

<body>

    <div class="row">
        <div class="col">
     <div class="limiter">
        <div class="container-login100" style="background-image: url('img/back-login.jpg');">
            <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
                <form class="login100-form validate-form form-group" method="POST" action="UserS">
                    <span class="login100-form-title p-b-49">
                        Registro
                    </span>

                    <input type="text" class="form-control mb-4  inputR" name="nombre" placeholder="Nombre" required >
                    <input type="text" class="form-control mb-4 inputR" name="apellido" placeholder="Apellidos" required>
                    <input type="email" class="form-control mb-4 inputR" name="correo" placeholder="Correo" required>
                    <input type="password" class="form-control mb-4 inputR" name="pass" placeholder="Contraseña" id="pass1" required>
                    <div id="error1" class="mb-2"></div>
                    <div class="row">
                        <div class="col-11">
                        <input type="password" class="form-control mb-4"  name="conf_pass" placeholder="Repita la Contraseña" id="pass2" required>                              
                        </div>
                        <div class="col-0.5 mt-1" id="error2" class=""></div>
                    </div>
                    
                    <button type="submit" class="btn btn-outline-primary btn-block" id="btn" >Registrarse</button>
                     <div class="row justify-content-center ">
                    <div class="col-5 mt-4">
                    <a href="Login.jsp" class="text-center">Tienes Cuenta?</a>
                    </div>
                    <div class="col-6 mt-4">
                    <a href="index.jsp" class="text-center">Pagina de inicio</a>
                    </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
        </div>
    </div>
    


    <div id="dropDownSelect1"></div>

    <!--===============================================================================================-->
    <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/animsition/js/animsition.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/bootstrap/js/popper.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/select2/select2.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/daterangepicker/moment.min.js"></script>
    <script src="vendor/daterangepicker/daterangepicker.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/countdowntime/countdowntime.js"></script>
    <!--===============================================================================================-->
    <script src="js/login_register.js"></script>

</body>

</html>