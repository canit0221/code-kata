N = int(input())
for i in range(N):
    M = i
    answer = i
    for i in str(M):
        M += int(i)
    if N == M:
        print(answer)
        exit()
print(0)

