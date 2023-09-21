function separator(num)
  {
    var separators = num.toString().split(".");
    separators[0] = separators[0].replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    return separators.join(".");
  }

  
console.log(separator(1000));
console.log(separator(10000));
console.log(separator(100000));