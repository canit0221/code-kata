from collections import Counter

def solution(s):
    c = Counter(s)
    string = [i for i, count in c.items() if count == 1]
    string.sort()
    return "".join(string)