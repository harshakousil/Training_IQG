array=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

array.forEach(element => {
    if(element %2 ==0)
    {
        console.log(element + " is even")
    }
    else{
        console.log(element+" is odd")
    }
});