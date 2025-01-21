
from itertools import product
def solution(l, r):
    ans = list(filter(lambda x: l <= x <= r, map(lambda x: int(''.join(x)), product('05', repeat=7))))
    return ans if ans else [-1]