function celsiustoFahrenheit(celsius) 
{
  var celsiusTemp = celsius;
  var celsiustoFahrenheit = celsiusTemp * 9 / 5 + 32;
  var result = celsiusTemp+'\xB0C is ' + celsiustoFahrenheit + ' \xB0F.';
    console.log(result);
}

function fahrenheittocelsius(fahrenheit) 
{
  var fahrenheitTemp = fahrenheit;
  var fahrenheittocelsius = (fahrenheitTemp - 32) * 5 / 9;
  var result = fahrenheitTemp+'\xB0F is ' + fahrenheittocelsius + '\xB0C.';
    console.log(result);
} 
celsiustoFahrenheit(60);
fahrenheittocelsius(45);