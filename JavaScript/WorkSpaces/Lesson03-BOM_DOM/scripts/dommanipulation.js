document.getElementById("addButton").addEventListener("click",()=>
{
    
    var article=document.getElementById("article-1");
    var para= document.createElement("p");
    var text="This is new paragraph"
   var textNode= document.createTextNode(text);
   para.appendChild(textNode);
   article.appendChild(para);

}
    )