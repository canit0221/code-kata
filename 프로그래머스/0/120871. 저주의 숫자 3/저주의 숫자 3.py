def solution(n):
    answer = 0
    num = 0
    
    while num < n:
        num +=1
        answer+=1
        
        while answer%3==0 or "3" in str(answer):
            answer+=1 
    
    return answer