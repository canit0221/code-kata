S = input()
answer = []

for i in range(ord("a"),ord("z")+1):
    try:
        answer.append(str(S.index(chr(i))))
    except:
        answer.append(str(-1))

print(" ".join(answer))