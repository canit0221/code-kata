def solution(score):
    avg_list = []
    
    for i in score:
        avg_list.append(sum(i)/2)
        
    sorted_avg = sorted(avg_list,reverse=1)
    rank = [sorted_avg.index(avg)+1 for avg in avg_list]

    return rank