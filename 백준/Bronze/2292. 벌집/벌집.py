N = int(input())
room = 1
tmp = 0

while room < N:
    room += tmp*6
    tmp += 1
    
print(max(1,tmp))