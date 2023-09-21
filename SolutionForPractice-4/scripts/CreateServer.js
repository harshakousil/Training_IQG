var http = require('http')


http.createServer((req,res)=>
{
    if(req.url == '/')
    {
        res.write('<html><body><h1>This is Index Page</h1></body></html>')
    }
    
    else if(req.url == '/foo')
    {
       res.write('<html><body><h1>This is Foo Page</h1></body></html>')
    }
}).listen(1111, ()=>
{
    console.log("server started")
})
