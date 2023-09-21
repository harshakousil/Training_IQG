function Stringconvertion(str) {
    if (str.length < 3) {
      return str.toUpperCase();
    }
    first3 = (str.substring(0, 3)).toLowerCase();
    remainingPart = str.substring(3, str.length);  
    return first3 + remainingPart;
  }
  console.log(Stringconvertion("Kousil Lakkapragada"));