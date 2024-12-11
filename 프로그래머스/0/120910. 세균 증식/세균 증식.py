def solution(n, t):
    answer = n
    
    while t > 0:
        t-=1
        answer *= 2
        
    return answer 