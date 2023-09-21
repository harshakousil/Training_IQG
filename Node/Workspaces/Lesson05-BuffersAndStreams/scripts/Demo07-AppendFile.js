var fs =require('fs')


fs.appendFile('Data1.txt',"This is awesome",(err,fd)=>
{
    if(err)
    {
    throw err;}
    else
    {
        console.log("Writing is completed")
    }
})