def solution(slice, n):
    pizza = 1
    
    while (pizza * slice) // n < 1:
        pizza += 1
    
    return pizza