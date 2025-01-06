def solution(arr, queries):
    answer = []
    
    for i in range(0,len(queries)):
        arr_list = []
        
        for j in range(queries[i][0] ,queries[i][1]+1):
            if arr[j] > queries[i][2]:
                arr_list.append(arr[j])
            
        if len(arr_list) == 0:
            answer.append(-1)
            
        else:
            answer.append(min(arr_list))

    return answer