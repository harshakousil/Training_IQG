var sum =function(a,b)
{
    return a+b;
}
function invoke(fn)
{
    return fn(23,26)
}
console.log(invoke(sum));