def solution(my_string):
    a = list(my_string.lower())
    a.sort()
    answer = ''.join(a)
    return answer