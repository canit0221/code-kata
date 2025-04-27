def solution(my_string):
    answer = [0 for _ in range(52)]
    alist = [chr(i) for i in range(ord('A'),ord('Z')+1)]+[chr(i) for i in range(ord('a'),ord('z')+1)]
    
    for i,j in enumerate(alist):
        answer[i] = my_string.count(j)
       
    return answer