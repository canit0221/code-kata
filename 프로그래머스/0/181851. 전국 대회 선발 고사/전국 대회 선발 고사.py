def solution(rank, attendance):
    answer = 0
    available = []

    for num in range(len(rank)):
        if attendance[num]:
            available.append(rank[num])
    
    available.sort()
    
    rank_list = []
    
    for i in range(3):
        rank_list.append(rank.index(available[i]))
    
    a,b,c = rank_list
    
    answer = 10000*a + 100*b + c
            
    return answer