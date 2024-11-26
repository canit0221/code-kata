def solution(slice, n):
    answer = 0
    pizza = 1
    
    while (pizza * slice) // n < 1:
        pizza += 1
    
    answer = pizza
    
    return answer