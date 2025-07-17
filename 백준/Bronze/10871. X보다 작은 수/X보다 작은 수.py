N,X = map(int,input().split())

num_list = list(map(int,input().split()))
answer = []
for i in num_list:
    if i < X:
        answer.append(str(i))
print(" ".join(answer))