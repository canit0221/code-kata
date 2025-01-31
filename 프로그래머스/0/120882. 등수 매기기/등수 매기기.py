def solution(score):
    avg_list = [] # 반복문 전에 리스트 초기화
    
    for i in score:
		    # 평균 계산
        avg_list.append(sum(i)/2)
    # 역순으로 정렬된 리스트 만들기    
    sorted_avg = sorted(avg_list,reverse=1)
    # 정렬된 리스트의 인덱스를 참조하여 순위 리스트 작성
    rank = [sorted_avg.index(avg)+1 for avg in avg_list]

    return rank