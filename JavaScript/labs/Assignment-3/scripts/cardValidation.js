function cardValidation(cardNumber)
{
    var cardPattern=/^(?:4[0-9]{12}(?:[0-9]{3})?)$/;;

    if(cardNumber.match(cardPattern))
    {
        console.log("Card is a valid  Visa card")
    }
    else{
        console.log("card is Not a valid  Visa card");
    }
}

cardValidation("4213262626754");