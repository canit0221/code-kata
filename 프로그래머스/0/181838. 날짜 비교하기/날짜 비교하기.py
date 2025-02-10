def solution(date1, date2):

    if date1[0] < date2[0]: # 연도가 빠름
        return 1
        
    elif date1[0] == date2[0]: # 연도가 같음
        
        if date1[1] < date2[1]: # 월이 빠름
            return 1
            
        elif date1[1] == date2[1]: #월이 같음
            
            if date1[2] < date2[2]: # 날짜가 빠름
                return 1
                
    return 0