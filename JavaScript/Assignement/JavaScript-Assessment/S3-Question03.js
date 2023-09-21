function Order(str){
    var array = str.split("");
    array.sort();
    var sortedStr = array.join("");
    return sortedStr
}

var str="kousil"

console.log(Order(str));