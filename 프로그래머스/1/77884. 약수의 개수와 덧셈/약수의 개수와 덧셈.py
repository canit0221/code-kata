def solution(left, right):
    answer = 0
    
    for n in range(left,right+1):
        count = 0
        for i in range(1,int(n**0.5)+1):
            if n % i == 0:
                count += 1
                if i*i != n:
                    count += 1
        if count % 2 == 0:
            answer += n
        else:
            answer -= n
            
    return answer