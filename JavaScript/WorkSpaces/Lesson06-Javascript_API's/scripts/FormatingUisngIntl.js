var givenNumber = new Number(1000000000.2323)

console.log(givenNumber);

var numberFormat=Intl.NumberFormat("en-US",{
    style: "Currency",
    currency :"USD",
    maximumFractionDigits:2
});
var convertedResult= numberFormat.format(givenNumber);
console.log(convertedResult);