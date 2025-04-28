def solution(arr, k):
    answer = []
    
    arr_checked = []
    for i in arr:
        if i not in arr_checked:
            arr_checked.append(i)
    
    
    if len(arr_checked) >= k:
        answer = arr_checked[:k]
        
    else:
        while len(arr_checked) < k:
            arr_checked.append(-1)
        answer = arr_checked
        
    return answer