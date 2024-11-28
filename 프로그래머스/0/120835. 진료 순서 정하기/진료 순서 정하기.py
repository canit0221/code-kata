def solution(emergency):
    answer = []
    des = list(reversed(sorted(emergency)))
    #높은숫자 순서로 정렬
    for i in emergency:
        answer.append(des.index(i)+1)
    #원래 리스트 숫자를 다시 탐색해서 인덱싱만 추출해서 순위 뽑기
    return answer