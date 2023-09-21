function isurlValid(string)
{
    try{
        new URL(string);
        return "It is Valid url";
    }catch(err)
    {
        return "url is not valid";
    }
}

console.log(isurlValid("https://www.google.com"));
console.log(isurlValid("google.com"));
