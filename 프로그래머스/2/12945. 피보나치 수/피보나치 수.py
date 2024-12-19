def solution(n):
    a,b,p = 1,1,1# 초기화    
    
    for i in range(1,n) :  # 반복마다 a에는 b, b에는 a+b를 할당하며 숫자 더해나감
          a,b = b,a+b
    p = a   #n번째 수열 값
    print(p)
    return p%1234567