function precise_round(number,place)
{
    let rounded_value=Math.round(number *10)/10;
    return rounded_value.toFixed(place);
}

console.log(precise_round(12.375,2))
console.log(precise_round(12.37499,2))
console.log(precise_round(-10.3079499,3))
