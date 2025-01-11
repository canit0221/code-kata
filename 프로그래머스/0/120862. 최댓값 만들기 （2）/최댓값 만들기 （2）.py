def solution(numbers):
    answer = 0
    multiply = []
    
    for i in range(0,len(numbers)):
        for j in range(0,len(numbers)):
            if i != j :
                multiply.append(numbers[i]*numbers[j])
    
    answer = max(multiply)    
    
    return answer