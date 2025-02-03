def solution(numlist, n):
    # 정렬이 완료될때까지 반복
    while True:
        # 변화가 있는지 확인하기 위해 이전의 numlist를 저장
        tmp = numlist[:]
        # 리스트 전체를 순회하며 인접한 두 원소를 비교
        for i in range(1,len(numlist)):
            # 거리가 가까운걸 앞으로 배치
            if abs(numlist[i-1]-n)>abs(numlist[i]-n):
                numlist[i-1],numlist[i] = numlist[i],numlist[i-1]
            # 거리가 동일하다면 더 큰수를 앞으로 배치    
            elif abs(numlist[i-1]-n)==abs(numlist[i]-n):
                minmax=[numlist[i-1],numlist[i]]
                numlist[i-1],numlist[i] =max(minmax),min(minmax)
        # 변화가 없다면 정렬된 리스트 이므로 반환   
        if tmp == numlist:
            return numlist