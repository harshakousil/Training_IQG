function amountTocoins(amount) {
    var num = amount;
    var arr=[25, 10, 5, 2, 1];
    var str = '';
    
    for (var i=0; i<arr.length; i++) {
      if (num>=arr[i]) {
        num = num - arr[i];
        str = str + arr[i] + ',';
        i--;
      }
    }
    console.log(str);
  }
  amountTocoins(46)