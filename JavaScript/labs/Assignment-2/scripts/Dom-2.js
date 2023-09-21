function getFormValue()
{
   var fname= document.getElementsByName("fname");
    var first_name=fname[0].value
    var lname= document.getElementsByName("lname");
    var last_name=lname[0].value

    console.log(first_name + " " +last_name);
}