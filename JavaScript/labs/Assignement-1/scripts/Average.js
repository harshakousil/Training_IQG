var student={
    David :80,
    Vinoth:77,
    Divya:88,
    Ishitha:95,
    Thomas:68
}
function Grading(studentobj)
{
    Object.values(studentobj).forEach(val=>{
        if(val=>90 && val<100)
        {
            console.log("grade is A")
        }
        else if(val=>80 && val<90)
        {
            console.log("grade is B")
        }
        else if(val=>70 && val<80)
        {
            console.log("grade is c")
        }
        else if(val=>60 && val<=70)
        {
            console.log("grade is D")
        }
        else
        {
            console.log("grade is F")
        }
});
}

Grading(student);