def solution(myString, pat):
    answer = 0
    j = len(pat)
    for i in range(len(myString)):
        if pat in myString[i:i+j]:
            answer += 1
    return answer