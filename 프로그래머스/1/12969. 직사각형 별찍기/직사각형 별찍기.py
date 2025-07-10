a, b = map(int, input().strip().split(' '))
square = ''
for i in range(a):
    square += '*'

for i in range(b):
    print(square)
    