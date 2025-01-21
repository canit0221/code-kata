def solution(i, j, k):
    answer = 0
    
    for i in range(i,j+1):
        if str(k) in str(i):
            num = str(i).count(str(k))
            answer += num
            
    return answer