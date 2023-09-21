function doAdd(...args) 
{
    let sum =0;

    for(let i of args)
    {
        sum+= i;
    }
    console.log("Sum :" + sum)

}
doAdd(20,30);
doAdd(34,56,78,90,45,67,898);