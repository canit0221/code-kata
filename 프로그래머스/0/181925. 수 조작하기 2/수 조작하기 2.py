def solution(numLog):
    answer = ''
    i=0
    while len(numLog)-1 > i:
        if numLog[i+1] - numLog[i] == 1:
            answer+= 'w'
        elif numLog[i+1] - numLog[i] == -1:
            answer+= 's'
        elif numLog[i+1] - numLog[i] == 10:
            answer+= 'd'
        elif numLog[i+1] - numLog[i] == -10:
            answer+= 'a'
        i+=1
        
    return answer