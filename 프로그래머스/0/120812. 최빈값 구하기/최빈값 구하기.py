def solution(array):
    answer = 0
    while len(array) != 0:
        for i,a in enumerate(set(array)):
            array.remove(a)
    return answer