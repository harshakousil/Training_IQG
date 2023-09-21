// code to check the mail format


function checkMailFormat(string)
{
    var mail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  

    if(mail.test(string))
    {
        return "Email is valid";
    }
    else{
        return "Email is not valid"
    }

}

console.log(checkMailFormat("kousil.lakkapragada@iqgateway.com"))
console.log(checkMailFormat("@iqgateway.com"))
