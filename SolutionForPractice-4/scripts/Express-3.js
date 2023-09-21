var express = require('express');
var bodyParser = require('body-parser');
var app = express();

app.use(bodyParser.urlencoded({extended: false}));

app.get('/', (req, res)=>{

    res.send(JSON.stringify({firstName : req.body.firstName,
        secondName:req.body.lastName}));
});

app.post('/submit', (req, res)=>{
    res.send(JSON.stringify({firstName : req.body.firstName, secondName: req.body.lastName}));
});

app.put('/update-data', (req, res)=>{
    res.send('PUT Request');
});

app.delete('/delete-data', (req, res)=>{
    res.send('DELETE Request');
});


var server = app.listen(2222, ()=>{
    console.log('Server started ');
})

