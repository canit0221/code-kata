def solution(arr, query):
    answer = []
    
    for i,j in enumerate(query):
        if i%2 == 0:
            arr = arr[:j+1]
        else:
            arr = arr[j:]
            
    answer = arr
    return answer