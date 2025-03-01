def solution(strArr):
    length_count = {}
    
    for i in strArr:
        length = len(i)
        if length in length_count:
            length_count[length] += 1
        else:
            length_count[length] = 1
    return max(length_count.values())