def solution(array):
    # 각 숫자의 출현 횟수를 저장할 딕셔너리 초기화
    counts = {}
    
    # 배열의 고유한 값들에 대해 반복
    for i in set(array):
        # 각 숫자의 출현 횟수를 계산하여 counts 딕셔너리에 저장
        counts[i] = array.count(i)
    
    # 가장 높은 출현 횟수를 찾음
    max_count = max(counts.values())
    
    # 가장 높은 출현 횟수를 가진 숫자들을 리스트로 저장
    modes = [key for key, value in counts.items() if value == max_count]
    
    # 최빈값이 여러 개일 경우 -1을 반환
    if len(modes) > 1:
        return -1
    else:
        # 최빈값이 하나일 경우 그 값을 반환
        return modes[0]