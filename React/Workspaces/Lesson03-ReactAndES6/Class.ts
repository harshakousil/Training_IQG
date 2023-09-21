class Dummy
{

    private name :string

    constructor(givenName :string)
    {
        this.name=givenName
    }
    getName() :string
    {
        return this.name
    }

    displayDetails()
    {
        return ("HI There welcome to TS :"+ this.getName())
    }
}

var nameRef=new Dummy("Kousil Lakkapragada");

console.log(nameRef.displayDetails());