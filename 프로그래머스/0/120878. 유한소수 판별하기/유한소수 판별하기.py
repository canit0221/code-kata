from fractions import Fraction

def solution(a, b):
    answer = 0
    # 기약분수 구하기
    frac = Fraction(a,b)
    # 분모 추출
    denom = frac.denominator
    
    #소인수 리스트만들기
    div_list = []
    div=2
    while div <= denom:
        if denom%div == 0:
            denom = denom/div
            div_list.append(div)
        else:
            div+=1
    #2와 5로만 이루어졌는지 확인
    if len(div_list) - div_list.count(2)-div_list.count(5) == 0:
        return 1
                
    return 2