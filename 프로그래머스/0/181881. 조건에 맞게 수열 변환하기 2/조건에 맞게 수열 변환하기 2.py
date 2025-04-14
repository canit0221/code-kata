def solution(arr):
    answer = 0
    arr_x = []
    arr_x1 = arr
    while arr_x != arr_x1:
        
        if answer == 0:
            for i in arr:
                if i >= 50 and i%2==0:
                    arr_x.append(i/2)
                elif i < 50 and i%2==1:
                    arr_x.append(i*2+1)
        else:
            for i in arr_x1:
                if i >= 50 and i%2==0:
                    arr_x.append(i/2)
                elif i < 50 and i%2==1:
                    arr_x.append(i*2+1)
        answer += 1
        arr_x1 = arr_x[:]
        arr_x = []
    return answer-1