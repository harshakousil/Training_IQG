function highlightBold()
{
    document.getElementById("link-1").addEventListener("mouseover",()=>{

        document.getElementsByTagName("Strong").style.setProperty('::highlight', 'yellow');
    })
}