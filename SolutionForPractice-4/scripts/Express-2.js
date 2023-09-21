var express = require('express');
var bodyParser = require('body-parser');
var app = express();

app.use(bodyParser.urlencoded({extended: false}));

app.get('/', (req, res)=>{
    res.sendFile('D:\\SolutionForPractice-4\\scripts\\Form.html');
});

app.post('/submit', (req, res)=>{
    res.send(JSON.stringify({firstName : req.body.firstName,
    secondName:req.body.lastName}));
});

var server = app.listen(2222, ()=>{
    console.log('Server started ');
})

