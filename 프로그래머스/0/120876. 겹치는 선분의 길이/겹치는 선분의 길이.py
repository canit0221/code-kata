def solution(lines):
    lines.sort()
    start=100
    end=-100
    for i in lines: # 전체배열 구하기
        start=min(min(i),start)
        end=max(max(i),end)
        
    count = [0 for i in range(start,end+1)]#빈평행선
    
    for i in lines: # 선배치
        for j in range(i[0]-start+1,i[1]-start+1): # 시작점 보정해서 반복
            count[j] +=1 # 선마다 +1 카운트, 시작점과 끝점은 포함안함
    answer = count.count(2)+count.count(3) #두개이상 겹치는곳의 개수
        
    return answer