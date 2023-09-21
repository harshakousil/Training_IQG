const path = require('path');
const fs = require('fs');
//joining path of directory 
const directoryPath = path.join(__dirname, 'Documents');
//passsing directoryPath and callback function
fs.readdir(directoryPath, function (err, files) {
    //handling error
    if (err) {
        return console.log('Unable to scan directory: ' + err);
    } 
    //listing all files using forEach
    files.forEach(function (file) {
        // Do whatever you want to do with the file
        console.log(file); 
    });
});








// require the file system module
var fs = require('fs');


var readable = fs.createReadStream(__dirname + 'data.txt', { encoding: 'utf8', highWaterMark: 16 * 1024 });

// create writable stream
var writable = fs.createWriteStream(__dirname + '/data1.txt');

// use pipe to copy readable to writable
readable.pipe(writable);







let content;
try {
  content = fs.readFileSync('data.txt', { encoding: 'utf8' });
} catch(err) {
  // An error occurred
  console.error(err);
}


