def solution(quiz):
    answer = []
    
    for i in quiz:
        i = i.split()
        
        if eval("".join(i[:3])) == int(i[-1]):
            answer.append("O")
        else:
            answer.append("X")
    
    return answer