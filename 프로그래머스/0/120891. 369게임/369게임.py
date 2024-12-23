def solution(order):
    answer = 0
    for i in range(3,10,3):
        answer += str(order).count(str(i))
    return answer