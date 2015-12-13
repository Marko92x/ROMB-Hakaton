 $('#logIn').click(function(){
       	var username = document.getElementById("email").value;
        var password = document.getElementById("password").value;
       	 if(username == "marko" && password == "marko") {
                location.href = "homepage.html";
            }
 });

