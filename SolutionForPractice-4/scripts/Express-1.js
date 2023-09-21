var express= require('express')

var app = express()


app.get('/', (req, res)=>
{
    res.send(" This is Welocome Message")
})

app.listen(3000, ()=>
{
    console.log('Server started')
})