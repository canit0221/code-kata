def solution(s):
    answer = 0
    s=s.split() # 공백 기준으로 문자열을 나누어 준다
    
    for i in range(0,len(s)):
        if s[i] == 'Z':
            answer -= int(s[i-1])
        else:
            answer += int(s[i])
    
    return answer