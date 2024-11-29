def solution(balls, share):
    answer = 0
    n = 1
    nm = 1
    m = 1
    
    for i in range(1,balls+1):
        n *= i
    for j in range(1,balls-share+1):
        nm *= j
    for k in range(1,share+1):
        m *= k
    
    answer = n/(nm*m)
    
    return answer