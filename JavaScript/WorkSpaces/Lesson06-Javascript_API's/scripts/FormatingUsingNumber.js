var givenNumber = new Number(10000000.2323)

console.log(givenNumber);

var convertedResult=givenNumber.toLocaleString("en-US",{
    style: "Currency",
    currency :"USD",
    maximumFractionDigits:2
});

console.log(convertedResult);