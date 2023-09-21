function Verification()
{
    
    var email=document.getElementById("email").value;
    var password = document.getElementById("pwd").value;
    var cpassword =document.getElementById("pwd-repeat").value;
    var username = document.getElementById("username").value;
    if(username == "" ) 
    {
        alert("UserName is Empty")
        return false;
        // document.getElementById("message").innerHTML = "user Name is Empty";  
        // document.getElementById("username").focus;
        // document.getElementById("username").innerHTML= " ";
    }
    if(username.length <= 6 ) 
    {
        alert("UserName should contain 6 letters ")
        return false;
        // document.getElementById("message").innerHTML = "user Name  Should be atlest 6 charcters";  
        // document.getElementById("username").focus;
        // document.getElementById("username").innerHTML= " ";
    }
    if(email =="" )
    {
        alert("Email should be in well form")
        return false;
    //     document.getElementById("message").innerHTML = "Email is empty";  
    //     document.getElementById("pwd").focus;
    //     document.getElementById("pwd").innerHTML= " ";
    // }
    }
    if(password == "")
    {
        alert("password is empty")
        return false;
    //    document.getElementById("message").innerHTML = "password is Empty/It Should be atlest 8 charcters";  
    //    document.getElementById("pwd").focus;
    //     document.getElementById("pwd").innerHTML= " ";
    }
    if(password.length<8)
    {
        alert("password must contain 8 letters")
        return false;
        // document.getElementById("message").innerHTML = "password Should be atlest 8 charcters";  
        // document.getElementById("pwd").focus;
        // document.getElementById("pwd").innerHTML= " ";
    }
    if(cpassword == "")
    {
        alert("confirm password is empty")
        return false;
    //  document.getElementById("message").innerHTML = "Repeat password is Empty/It Should be atlest 8 charcters";  
    //  document.getElementById("pwd-repeat").focus;
    //  document.getElementById("pwd-repeat").innerHTML= " ";
    }
    if(password.length >= 8 && cpassword.length >= 8 )
    {
       if(password != cpassword)
       {
        alert("Passwords do not matches");
        return false;
        // document.getElementById("message").innerHTML ="Password and Confirm Password does not matched. Try again later. ";
        // document.getElementById("pwd").focus;
        // document.getElementById("pwd").innerHTML= " ";
        // document.getElementById("pwd-repeat").focus;
        // document.getElementById("pwd-repeat").innerHTML= " ";
       }
    }
    // if(username != " " || password != " " || email !=" "){
    // document.getElementById("message").style.color="green";
    // document.getElementById("message").innerHTML="You have sucessfully registered";
    // }

}

document.getElementById("submit").addEventListener("click", Verification());





