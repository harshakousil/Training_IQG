class InventoryItem
{
    constructor(givencondition, givnprice)
    {
        this.condition=givencondition;
        this.price=givnprice;
    }
    sayHello()
    {
        console.log("Hello from Inventory Item");
    }
}
class Movie extends InventoryItem
{
    constructor(givenId, givenTitle,givenRating, givencondition,givnprice)
    {
        super(givencondition,givnprice)
        this.id=givenId
        this.title=givenTitle
        this.rating=givenRating
    }
    displayDetails()
    {
        console.log("Movie Details")
        console.log("ID :"+this.id);
        console.log("Title : "+this.title);
        console.log("Rating :"+ this.rating);
        console.log("condition :"+ this.condition);
        console.log("price :" +this.price);
    }
    
    
    
}

var mov1Ref =new Movie("1000", "vikram","good", "Okay Okay","150 rupees");
mov1Ref.displayDetails();