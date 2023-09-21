function inventoryItem(price, condition)
{
    this.condition=condition;
    this.price=price;
}

inventoryItem.prototype.sayHello= function()
{
    console.log("Hello from Inventory Item")
}

function Movie()
{

}

Movie.prototype= new inventoryItem();

var mov1= new Movie();

mov1.sayHello();