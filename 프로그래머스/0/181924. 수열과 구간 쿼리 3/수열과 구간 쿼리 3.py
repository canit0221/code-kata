def solution(arr, queries):
    answer = []
    
    for i,j in queries:
        arr_tmp = arr.copy()
        
        arr[i] = arr_tmp[j]
        arr[j] = arr_tmp[i]
        
    return arr