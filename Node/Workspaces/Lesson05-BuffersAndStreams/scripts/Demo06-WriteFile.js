var fs =require('fs')

var data = "This is very wonderfull news."

fs.writeFile('Data1.txt',data,(err,fd)=>
{
    if(err)
    {
    throw err;}
    else
    {
        console.log("Writing is completed")
    }
})