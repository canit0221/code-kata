def solution(n):
    num = n+1
    
    while bin(n).count('1') != bin(num).count('1'):
        num += 1
    return num