let interval = setInterval(()=>
{
    console.log("This is Set Interval Funstion")
},1000)


setTimeout(() => {
    clearInterval(interval);
    console.log("This is Final Message")
  },5000);

