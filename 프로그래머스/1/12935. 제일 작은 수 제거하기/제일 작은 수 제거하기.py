def solution(arr):
    min_value = min(arr)
    arr.remove(min_value)
    
    if not arr:
        arr.append(-1)
        
    answer = arr
    return answer