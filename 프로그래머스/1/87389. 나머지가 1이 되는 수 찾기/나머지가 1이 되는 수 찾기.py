def solution(n):
    answer = 0
    divide = []
    
    for i in range(n-1,1,-1):
        if n % i == 1:
            divide.append(i)
            
    answer = divide[-1]
    return answer