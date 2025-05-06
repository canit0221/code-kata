def solution(n):
    list_n = list(str(n))
    answer = int(''.join(sorted(list_n,reverse=True)))
    return answer