def solution(numbers, direction):
    answer = []
    
    if direction == 'left':
        left = list([numbers.pop(0)])
        answer = numbers + left
        
    
    else :
        right = list([numbers.pop(-1)])
        answer = right + numbers
    
    return answer