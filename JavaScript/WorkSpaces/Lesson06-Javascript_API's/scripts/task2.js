var data="John,Doe,32,1982,10,23,153.25, A ,";

var result= data.split(",")
console.log(result);

var object=
{
    firstName : result[0],
    lastName :result[1],
    age: result[2],
    DOB:result[3],
    month:result[4],
    day :result[5],
    height:result[6],
    grade:result[7].trim()


}
console.log(object);