const mySentence = "one of the best way to solve the problem is divide and rule";
const words = mySentence.split(" ");

for (let i = 0; i < words.length; i++) {
    words[i] = words[i][0].toUpperCase() + words[i].substr(1);
}
words.join(" ");
console.log(words);