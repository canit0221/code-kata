def solution(array):
    answer = 0
    array = map(str,array)
    array = "".join(array)
    
    for i in array:
        if i == "7":
            answer += 1
    
    
    return answer