var base_convert = function(number, initial_base, final_base) {
    if ((initial_base && final_base) <2 || (initial_base && final_base)>36)
     return 'Base is not  between 2 , 36';
    
     return parseInt(number + '', initial_base).toString(final_base);
 }
 
 console.log(base_convert('E164',16,8));
 console.log(base_convert(1000,2,8));