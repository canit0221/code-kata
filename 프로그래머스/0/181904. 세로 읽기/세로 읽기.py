def solution(my_string, m, c):
    answer = ''
    horizon = []
    for i in range(0,len(my_string),m): # 가로로 적기
        horizon.append(my_string[i:i+m])
        
    for i in range(0,len(horizon)): # c번째 열만 추출
        answer += horizon[i][c-1]
    return answer