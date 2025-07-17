T = int(input())

for test_case in range(T):
    H,W,N = list(map(int,(input().split())))
    floor = N % H * 100
    room = N//H + 1
    if not floor:
        floor = H * 100
        room -= 1
    
    print(floor+room)