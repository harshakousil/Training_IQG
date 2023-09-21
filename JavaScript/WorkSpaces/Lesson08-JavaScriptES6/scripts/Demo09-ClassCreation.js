class Movie
{
    constructor(givenId, givenTitle,givenRating)
    {
        //declare and Initialize the Instance Variables
        this.id=givenId;
        this.title=givenTitle;
        this.rating=givenRating
    }

    displayDetails()
    {
        console.log("Movie Details")
        console.log("ID :"+this.id);
        console.log("Title : "+this.title);
        console.log("Rating :"+ this.rating);
    }
}

var mov1Ref=new Movie(1001,"vikram", "Fantabulous");
mov1Ref.displayDetails();