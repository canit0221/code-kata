N = int(input()) # 참가자수
size = list(map(int,input().split()))
T,P = map(int,input().split())

num_T = 0


for i in size:
    num_T += i//T +1
    if not i % T:
         num_T -= 1
num_P_set = N//P
num_P_piece = N%P

print(num_T)
print(N//P,N%P)