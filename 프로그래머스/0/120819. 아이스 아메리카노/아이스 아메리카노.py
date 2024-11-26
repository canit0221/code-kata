def solution(money):
    answer = [0,0]
    
    answer[0] = money // 5500 # 커피가 몇잔?
    
    if money >= 5500 : #한잔이상 사먹을때 잔돈
        answer[1] = money % 5500
        
    else: #한잔도 못마실경우 잔돈
        answer[1] = money 
    
    return answer