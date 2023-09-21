
const sendResponse = (response, statusCode, contentType, content) => {
  response.writeHead(statusCode, { 'Content-Type': contentType });
  response.end(content);
};

 

const controller = {
  index(request, response) {
    const html = '<html><body><h1>Welcome to index.html</h1></body></html>';
    sendResponse(response, 200, 'text/html', html);
  },
  foo(request, response) {
    const html = '<html><body><h1>Welcome to foo.html</h1></body></html>';
    sendResponse(response, 200, 'text/html', html);
  },
  notFound(request, response) {
    sendResponse(response, 404, 'text/plain', '404 Not Found');
  },
};

 

module.exports = controller;