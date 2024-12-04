def solution(s):
    answer = 0
    if s[0] != '(' or s[-1] != ')':  
        return False

    count = 0
    for i in s:
        if i == '(':
            count += 1 
        elif i == ')':
            count -= 1 
        
        # 항상 여는게 더 많아야함 
        if count < 0:
            return False # 역전되면 바로 false를 반환해야 오류안생김

    if count == 0:
        answer = True
    else:
        return False

    return answer