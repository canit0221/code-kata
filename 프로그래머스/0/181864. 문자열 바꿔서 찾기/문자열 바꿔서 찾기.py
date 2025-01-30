def solution(myString, pat):
    answer = 0
    a = myString.replace("A","C")
    a = a.replace("B","A")
    a = a.replace("C","B")
    print(a)
    if pat in a:
        return 1
    
    return 0