

var url = require('url');
var adress = 'http://www.iqgateway.com';
var query = url.parse(adress, true);

console.log(query.host); 
console.log(query.pathname); 
console.log(query.port)
console.log(query.protocol)
const myURLs =[
    new URL('https://www.google.com'),
    new URL('https://www.youtube.com'),
];

console.log(JSON.stringify(myURLs));