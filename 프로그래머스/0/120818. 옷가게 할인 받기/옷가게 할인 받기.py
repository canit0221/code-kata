def solution(price):
    answer = 0
    discount_rate = 0
    
    if price >= 500000:
        discount_rate = 0.2
        
    elif price >= 300000:
        discount_rate = 0.1
        
    elif price >= 100000:
        discount_rate = 0.05
        
    answer = int(price*(1-discount_rate))
        
    return answer