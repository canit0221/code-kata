def solution(arr):

    row = len(arr)

    for i in arr:
        col = len(i)
        if len(i) < row:
            while len(i) < row:
                i.append(0)
        else:
            break
    
    while col > len(arr):
        zero = [0 for _ in range(col)]
        arr.append(zero)
    
    return arr