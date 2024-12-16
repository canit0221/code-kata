def solution(babbling):
    answer = 0
    pron = ["aya", "ye", "woo", "ma"]
    
    for b in babbling:
        
        while True:
            original_b = b  # 원래 문자열 저장
            for p in pron:
                if b.find(p) == 0: # 첫번째에 있을 때만 제거
                    b = b.replace(p, '')
            if original_b == b:  # 더 이상 변경이 없으면 종료
                break
        if len(b)==0:
            answer += 1

    return answer