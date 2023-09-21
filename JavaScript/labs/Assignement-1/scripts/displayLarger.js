var num1=20

var num2=10

function largerNum(num1,num2)
{
    if(num1>num2)
    {
        return num1
    }
    else if(num1==num2)
    {
        return "Both are same"
    }
    else{
        return num2
    }
}

console.log(largerNum(num1,num2))