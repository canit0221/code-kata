def solution(numlist, n):
    while True:
        tmp = numlist[:]
        for i in range(1,len(numlist)):
            if abs(numlist[i-1]-n)>abs(numlist[i]-n):
                numlist[i-1],numlist[i] = numlist[i],numlist[i-1]
            elif abs(numlist[i-1]-n)==abs(numlist[i]-n):
                minmax=[numlist[i-1],numlist[i]]
                numlist[i-1],numlist[i] =max(minmax),min(minmax)
            
        if tmp == numlist:
            return numlist
        
    
            