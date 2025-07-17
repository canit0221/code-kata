T =  int(input())

for i in range(T):
    S,P = input().split()
    answer = ''
    for i in P:
        answer +=  i*int(S)

    print(answer)
