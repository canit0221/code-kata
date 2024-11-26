def solution(money):
    answer = [0,0]
    
    answer[0] = money // 5500
    
    if money >= 5500 :
        answer[1] = money % 5500
    else:
        answer[1] = money
    
    return answer