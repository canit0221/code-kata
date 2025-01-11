def solution(num, k):
    num = list(str(num))
    
    for i in range(0,len(num)):
        if num[i] == str(k):
            return i+1
        
    return -1