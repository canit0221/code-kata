def solution(s):
    answer = ''
    
    s = list(map(int,s.split()))
    s.sort()
    answer = f'{s[0]} {s[-1]}'

    return answer