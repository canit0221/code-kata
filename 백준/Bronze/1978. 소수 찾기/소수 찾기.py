N = int(input()) # 숫자 개수
num_list = list(map(int,input().split()))
answer = N # 소수의 개수를 담기 위함

for num in num_list:
    if num > 2:
        for i in range(2,int(num**(0.5))+1):
            if num % i == 0:
                answer -= 1
                break
    elif num == 1:
        answer -= 1

print(answer)