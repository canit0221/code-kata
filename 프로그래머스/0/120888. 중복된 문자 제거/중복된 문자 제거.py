def solution(my_string):
    answer = ''
    # strlist = [i for i in my_string if i not in strlist] #1 리스트컴프리헨션 안됩니다.
    strlist = []
    for i in my_string: #2
        if i not in strlist:
            strlist.append(i)
    
    answer = ''.join(strlist)
    return answer