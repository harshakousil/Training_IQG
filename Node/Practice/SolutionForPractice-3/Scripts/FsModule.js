var fs = require('fs');
var path = 'Data.txt';


var http = require('http');


http.createServer(function (req, res) {

//execute permission
fs.access(path, {encoding :'utf-8'}, fs.constants.X_OK, (err) => {
    if (err) {
        res.write("%s doesn't exist", path);
    } else {
        res.write('can execute %s', path);
    }
});
//read write permission
fs.access(path,{encoding :'utf-8'} ,fs.constants.R_OK | fs.constants.W_OK, (err) => {
    if (err) {
        res.write("%s doesn't exist", path);
    } else {
        res.write('can read/write %s', path);
    }
});
//File Exits code
if (fs.existsSync(path)) {
  // path exists
  res.write("exists:", path);
} else {
  res.write("DOES NOT exist:", path);
}


//Directory Exists

fs.access("../Scripts", function(error) {
  if (error) {
    res.write("Directory does not exist.")
  } else {
    res.write("Directory exists.")
  }
})


res.end();
}).listen(3000); 