var express = require('express');
var bodyParser = require('body-parser');
var app = express();

app.use(bodyParser.urlencoded({extended: false}));

app.get('/', function(req, res){
    res.sendFile('C:/Users/kousil.lakkapragada/OneDrive - iqgateway pvt ltd/Desktop/Training/Node/Workspaces/Lesson07-ServerSideApPlication/Form');
});

app.post('/submit-data', function(req, res){
    var name = req.body.firstName + " " + req.body.lastName;
    res.send(name + ' Submitted the Request ');
});

app.put('/update-data', function(req, res){
    res.send('PUT Request');
});

app.delete('/delete-data', function(req, res){
    res.send('DELETE Request');
});


var server = app.listen(5000, function(){
    console.log(' Node JS Server is Running ');
});