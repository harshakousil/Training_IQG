var http = require('http')
const { json } = require('stream/consumers')

var server =http.createServer(function (req,res) {

    
            if(req.url =="/")
            {
                res.writeHead(200, {'Content-type':'application/json'})
                res.write(JSON.stringify({message : "Welcome to The World of Express and Node js"}))

            }
 
            
}).listen(3002)
console.log("Server Started")

