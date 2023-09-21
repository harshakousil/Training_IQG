var fs= require('fs')

fs.unlink('Data.txt', (err)=>
{
    if(err)
    {
        console.log(err)
    }
    else{
        console.log("Deleted Successfully")
    }
})


fs.unlinkSync('Data.txt', (err)=>
{
    if(err)
    {
        console.log(err)
    }
    else{
        console.log("Deleted Successfully")
    }
})