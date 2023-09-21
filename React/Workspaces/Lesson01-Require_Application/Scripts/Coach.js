define(['./CoachDetails'], function(coachRef)
{
    return{
        displayDetails :function(){
            document.write("Coach Name :" + coachRef.CoachName + ", Coaches for " + coachRef.team)
        }
    }
})