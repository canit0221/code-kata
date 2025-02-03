def solution(num, total):
    if total%num==0: # total이 나누어 떨어짐
        mid = total//num
        start=mid-num//2
        
    else : 
        mid = total//num
        start=mid-(num-1)//2
    
    end = start+num
    answer =[i for i in range(start,end)]
  
    return answer