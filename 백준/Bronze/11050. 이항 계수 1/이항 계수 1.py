N,K = map(int,input().split())

up = 1
down = 1

for i in range(K):
    up *= (N-i)

for i in range(K):
    down *= (K-i)

print(int(up/down))