window.addEventListener("load", ()=>
{
    document.getElementById("ageButton").addEventListener("click",()=>
    {
     var input=document.getElementById("geInput").value;
     //var input=inp.value;

     var output=document.getElementById("ageOutput");

     var age=parseInt(input,10);

     var result="";

     if(isNaN(age))
     {
        result="Input a Number pls...."
     }
     else{
        result=((100-age)+ "Years  to go for a centuray");

     }
     output.innerHTML=result;
    })
})