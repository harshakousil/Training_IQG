
function checkNumber(num1,num2)
{
    if(num1 == 50  || num2 ==50)
    {
        return "true";
    }
    else if(num1+num2===50)
    {
        return "true"
    }
    else{
        return "false"
    }
}

console.log(checkNumber(50,0))
console.log(checkNumber(10,40))