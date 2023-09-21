var count = 5;
var num = 1;
var result=[]; 
while(count>0) 
{
    while(!happyNumber(num))
        num++ ;
    result.push(num);
    num++;
    count--;
}


function happyNumber(num) 
{
    var temp, remainder ;
    var array = [] ;
 
    while(num != 1 && array[num] !== true) 
    {
        array[num] = true ;
        temp = 0 ;
        while (num > 0) {
            remainder = num % 10 ;
            temp += remainder * remainder ;
            num = (num  - remainder) / 10 ;
        }
        num = temp ;
    }
    return (num == 1) ;
}
 
console.log(result);