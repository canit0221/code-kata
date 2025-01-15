def solution(n):
    answer = '수'
    
    while len(answer)<n:
        if answer[-1] =='수':
            answer += '박'
        else:
            answer += '수'
    
    return answer