
var totalMarks=100

var typeOfExam="Final-exam"

function calculateGrade(totalMarks,typeOfExam){
if(totalMarks=>80 && totalMarks<=100)
{
    var grade="A+"

    if(typeOfExam =="Final-exam" && grade=="A+")
    {
        if(totalMarks>=90)
        {
            return true;
        }
        else{
            return false
        }
    }
    else{
        return false;
    }
    
}
else{
    return false
}
}
console.log(calculateGrade(totalMarks,typeOfExam));