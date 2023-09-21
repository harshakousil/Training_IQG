function nonRepeated(str) {
    for(let i = 0; i < str.length; i++) {
       let j = str.charAt(i)
       if (str.indexOf(j) == str.lastIndexOf(j)) {
         return j;
       }
    }
    return null;
}
console.log(nonRepeated("racecar")) 