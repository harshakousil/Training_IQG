var http= require("http")

http.createServer(function (req,res) {
    console.log("Server started")
    
    res.writeHead(200, {'content-type':'text/html'})
    res.end('welcome to the New Era of Devloping a[pplications using Node js')
}).listen(1234)

