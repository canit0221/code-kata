def solution(n):
    answer = 0
    txt = str(n)
    for i in range(0,len(txt)):
        answer += int(str(n)[i])

    return answer