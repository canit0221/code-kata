T = int(input())
for _ in range(T):
    answer = 0
    O = input().split("X")

    for string in O:
        if string:
            for i in range(len(string)+1):
                answer += i
    print(answer)
