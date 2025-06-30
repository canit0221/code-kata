def solution(price, money, count):
    n = price
    
    while count > 0:
        count -= 1
        money -= price
        price += n
        
    if money < 0:
        answer = -money
    else:
        answer = 0

    return answer