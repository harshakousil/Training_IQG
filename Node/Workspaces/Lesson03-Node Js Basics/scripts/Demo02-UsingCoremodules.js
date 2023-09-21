var http =require('http')

//or 

//import {http} from "http"


var server =http.createServer( (req, res)=>
{
    res.end("Hello from the server...");
}).listen(2332)