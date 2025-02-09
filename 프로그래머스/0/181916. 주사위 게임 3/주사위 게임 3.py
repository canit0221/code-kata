from collections import Counter

def solution(a, b, c, d):
    dice = [a,b,c,d]
    counter = Counter(dice)
    counter = sorted(counter.items(),key=lambda x:x[1],reverse=True)
    keys = [key for key, _ in counter]

    if len(counter)==1:
        p=keys[0]
        answer = 1111*p
    
    elif len(counter)==2:
        p,q=keys
        if counter[0][1]==counter[1][1]:
            answer = (p+q)*abs(p-q)
        else:
            answer = (10*p+q)**2
        
    elif len(counter)==3:
        p,q,r=keys
        answer = q*r
        
    else:
        answer = min(dice)
        
    return answer