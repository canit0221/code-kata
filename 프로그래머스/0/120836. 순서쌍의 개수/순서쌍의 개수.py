def solution(n):
    dvisor = []
    for i in range(1,n+1):
        if n % i == 0:
            dvisor.append(i)
    
    answer = len(dvisor)
      
    return answer