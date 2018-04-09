 
(function ($) {
    "use strict";


     /*==================================================================
    [ Focus input ]*/
    $('.input100').each(function(){
        $(this).on('blur', function(){
            if($(this).val().trim() != "") {
                $(this).addClass('has-val');
            }
            else {
                $(this).removeClass('has-val');
            }
        })    
    })
  
  
    /*==================================================================
    [ Validate ]*/
    var input = $('.validate-input .input100');

    $('.validate-form').on('submit',function(){
        var check = true;

        for(var i=0; i<input.length; i++) {
            if(validate(input[i]) == false){
                showValidate(input[i]);
                check=false;
            }
        }

        return check;
    });


    $('.validate-form .input100').each(function(){
        $(this).focus(function(){
           hideValidate(this);
        });
    });

    function validate (input) {
        if($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
            if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                return false;
            }
        }
        else {
            if($(input).val().trim() == ''){
                return false;
            }
        }
    }

    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }
    
    

})(jQuery);

$(document).ready(function(){
$('#pass2').keyup(function(){

    var pass1 = $('#pass1').val();
    var pass2 = $('#pass2').val();
    var boton = document.getElementById("btn");
    if(pass1 == pass2){
        $('#error2').css("background","url(img/bien1.png)");
        btn.disabled = false;  
    }
    else{
        $('#error2').css("background","url(img/error.png)");
        btn.disabled = true;
    }
    if (pass2.length < 8 || pass2 != pass1 ) {
        
        btn.disabled = true;
    } else {
        
            if (pass1.length >=8) {
              
                btn.disabled = false;
            }
        
    }



});
$('#pass1').keyup(function () {

    var pass1 = $('#pass1').val();
    var pass2 = $('#pass2').val();
    var boton = document.getElementById("btn");
    if (pass1 == pass2) {
       $('#error2').css("background", "url(img/bien1.png)");  
        btn.disabled = false;
    } else {
        $('#error2').css("background", "url(img/error.png)");
        btn.disabled = true;
    }
    
    if (pass1.length <8) {
        $('#error1').text("Contrase\u00f1a muy corta").css("color", "red");
        btn.disabled = true;           
    }else{
        if (pass1.length >= 8){
            $('#error1').text("Contrase\u00f1a Exelente").css("color", "green");
                     

        }
          
    }

});
});