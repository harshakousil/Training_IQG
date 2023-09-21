var http = require('http');


http.createServer(function (req, res) {
  res.write('Welcome to Node js ! The current date anda time is :' +Date.now()); 
  res.end();
}).listen(3000); 






