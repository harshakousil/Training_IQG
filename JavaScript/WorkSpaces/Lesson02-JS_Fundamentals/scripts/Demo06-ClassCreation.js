function movie(givenId,givenTitle,givenRating){
    this.id=givenId;
    this.title=givenTitle;
  
  this.rating=givenRating

this.displayDetails=displayDetails;

}

function displayDetails()
{
    console.log("movie details")
    console.log("movie Id" + this.id);
    console.log("Movie Title "+this.title);
    console.log("Rating : "+this.rating);
}

var mov1=new movie(1001, "RRR","Good");
mov1.displayDetails();


console.log(typeof(movie))