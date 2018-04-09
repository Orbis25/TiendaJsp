<!DOCTYPE html>

<html lang="en">
<head>
	<title>Login </title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon"  href="img/laptop.ico"/>
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
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('img/back-login.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
                            <form class="login100-form validate-form" method="POST" action="UserL">
					<span class="login100-form-title p-b-49">
						Login
					</span>

					<div class="wrap-input100 validate-input m-b-23" data-validate = "El Correo es Requerido">
						<span class="label-input100">Correo</span>
						<input class="input100 inputl" type="text" name="correo" placeholder="Escribe tu Correo">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="La Contrase�a es requerida">
						<span class="label-input100">Contrase�a</span>
						<input class="input100 inputl" type="password" name="pass" placeholder="Escribe tu Contrase�a">
						<span class="focus-input100" data-symbol="&#xf190;"></span>
					</div>
					
					<div class="text-right p-t-8 p-b-31">
						<a href="#">
							Olvidaste tu Contrase�a?
						</a>
					</div>
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn"
                                                     >
							<div class="login100-form-bgbtn"></div>
							<button type="submit" class="btn login100-form-btn" >Entrar</button>
								
							
						</div>
					</div>

					
					<div class="flex-col-c p-t-60">
						<span class="txt1 p-b-17">
							O Registrate
						</span>

						<a href="new_acount.jsp" class="txt2">
							Pulsando aqui
						</a>
					</div>
				</form>
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