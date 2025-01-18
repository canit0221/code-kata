def solution(my_str, n):
    answer = []
    start = 0
    
    while  start < len(my_str):
        answer.append(my_str[start:start+n])
        
        start += n
    
    return answer