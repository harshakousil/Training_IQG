const http = require('http');
const controller = require('./controller');

 

const server = http.createServer((request, response) => {
  switch (request.url) {
    case '/':
      controller.index(request, response);
      break;
    case '/foo':
      controller.foo(request, response);
      break;
    default:
      controller.notFound(request, response);
      break;
  }
});

 

server.listen(3212, () => {
  console.log('Server is running on port 3000')});
