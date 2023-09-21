var express = require('express')
var app= express()


app.listen(3000, ()=>
{
    console.log("Server Started")
})

app.get('/', (req,res)=>
{
    res.send("Hello World")
}
)