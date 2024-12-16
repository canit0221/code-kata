def solution(babbling):
    answer = 0
    pron = ["aya", "ye", "woo", "ma"]
    
    for b in babbling:
        # 발음이 남아있을 동안 반복
        while True:
            original_b = b  # 원래 문자열 저장
            for p in pron:
                if b.find(p) == 0:
                    b = b.replace(p, '', 1)  # 첫 번째 발생만 제거
            if original_b == b:  # 더 이상 변경이 없으면 종료
                break
        if len(b) == 0:
            answer += 1

    return answer