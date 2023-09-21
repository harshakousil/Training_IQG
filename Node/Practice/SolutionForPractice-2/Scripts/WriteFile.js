var fs =require('fs')

var data = "India lost WTC Final Against Austrlia"

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

//writing to file synchrounsly
fs.writeFileSync('Data2.txt',data,(err,fd)=>
{
    if(err)
    {
    throw err;}
    else
    {
        console.log("Writing is completed")
    }
})