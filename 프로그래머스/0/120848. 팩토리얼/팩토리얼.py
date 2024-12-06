def solution(n):
    i = 1
    num = 1
    
    while num <= n:
        i += 1
        num *= i
    return i-1