
function clone_array(array)
{
    
  
    var final=[...array]
    return final
}

console.log(clone_array([1,2,4,0]))
console.log(clone_array([1,2,[4,0]]))
