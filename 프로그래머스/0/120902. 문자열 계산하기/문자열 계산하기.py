def solution(my_string):
    
    cal_list = my_string.split()
    answer = int(cal_list[0])
    i=1
    
    while len(cal_list) > i:
        
        if cal_list[i] =='+':
            answer += int(cal_list[i+1])
            
        elif cal_list[i] == '-':
            answer -= int(cal_list[i+1])
            
        i+=2
             
    return answer