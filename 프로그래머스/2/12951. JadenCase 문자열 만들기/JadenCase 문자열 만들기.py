def solution(s):
    answer = s[0].upper()
    s= s.lower()
    
    for i in range(len(s)-1):
        if s[i] == " "  and s[i+1] != " ":
            answer += s[i+1].upper()
        else:
            answer += s[i+1]
            
    return answer