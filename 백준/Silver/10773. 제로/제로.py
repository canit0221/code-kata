K = int(input())
num_list = []
for _ in range(K):
    num = int(input())
    if not num:
        del num_list[-1]
    else:
        num_list.append(num)

print(sum(num_list))