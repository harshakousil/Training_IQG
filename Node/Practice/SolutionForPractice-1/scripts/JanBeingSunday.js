function janBeingSunday() {
    for (var year = 2014; year <= 2050; year++) {
      var dateObj = new Date(year, 0, 1);
      if (dateObj.getDay() === 0) {
        console.log('The first day of ' + year + ' is a Sunday');
      }
    }
  }
  
  janBeingSunday();