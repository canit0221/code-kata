def solution(num_list):
    p = 0
    m = 1
    
    for i in range(0,len(num_list)):
        p += num_list[i]
        m *= num_list[i]
    
    if m < p**2:
        answer = 1
    else:
        answer = 0
       
    return answer