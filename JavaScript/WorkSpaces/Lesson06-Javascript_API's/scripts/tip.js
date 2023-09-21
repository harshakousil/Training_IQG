window.addEventListener("load" ,()=>
{
    document.getElementById("btn").addEventListener("click", ()=>
    {
        var bill= document.getElementById("Totalbill").value ;

        var people=document.getElementById("people").value;
     
        var output=document.getElementById("output");

        var tipBill=parseInt(bill,10)
        var persons=parseInt(people,10)

        if(isNaN(tipBill) || isNaN(persons))
        {
            var message= " Please enter the correct values";
            output.innerHTML= message;
            return false
        }
        else{
             var bill_with_discount = tipBill+(tipBill *0.1 );

             var finalbill=bill_with_discount+tipBill

             var each_personCost= finalbill/persons;
        }
        message="The bill for each person after adding discount is" + (each_personCost);
        output.innerHTML=message;
    })
 

})