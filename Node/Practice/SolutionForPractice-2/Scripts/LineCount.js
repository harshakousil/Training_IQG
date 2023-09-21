
var fs = require('fs');
var countLine =0;
var readerStream = fs.createReadStream('Data.txt');
readerStream.setEncoding('UTF8');

readerStream.on('data', function(values){
   
   for(var i=0; i<values.length; ++i)
   {
    if(values[i] ==10)
        countLine ++
   }
});
readerStream.on('end', function(){
    console.log(countLine);
})
readerStream.on('err',function(err){
    console.log(err.stack);
})
