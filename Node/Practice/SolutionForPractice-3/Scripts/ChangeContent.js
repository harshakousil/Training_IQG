var fs = require('fs');
 
fs.readFile('data.txt', 'utf-8', function(err, data) {
    if (err) throw err;
 
    var newValue = "Kousil Lakkapragada"
 
    fs.writeFile('index.txt', newValue, 'utf-8', function(err, data) {
        if (err) throw err;
        console.log('Done!');
    })
})
