def solution(numbers, k):
    i=1
    extend = numbers + numbers
    
    while (2*k-1) > (i*len(numbers)):
        i+=1
        extend += numbers
    answer = extend[2*(k-1)]
    
    return answer 
    
        
        
    

    

   