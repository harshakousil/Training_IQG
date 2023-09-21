

var http = require('http')


http.createServer((req,res)=>
{
    if(req.url == '/index')
    {
        res.write('<html><body><h1>This is Index Page</h1></body></html>')
    }
    else{
        res.end()
    }

}).listen(1234, ()=>
{
    console.log("server started")
})
