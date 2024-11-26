def solution(x, n):
    answer = []

    while len(answer) < n:
        answer.append(x)
        x += answer[0]
        
    return answer