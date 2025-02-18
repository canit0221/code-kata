def solution(arr):
    answer = []
    index = []
    for i,j in enumerate(arr):
        if j == 2:
            index.append(i)
    print(index)
    
    if index:
        return arr[index[0]:index[-1]+1]
    else:
        return [-1]