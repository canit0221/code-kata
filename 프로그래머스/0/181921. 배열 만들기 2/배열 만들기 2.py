def solution(l, r):
    answer = []
    for i in range(l,r+1):
        a = str(i).replace("0","")
        a = str(a).replace("5","")
        if a=="":
            answer.append(i)
    if not len(answer):
        return [-1]
        
    return answer