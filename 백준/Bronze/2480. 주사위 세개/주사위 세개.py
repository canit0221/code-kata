a,b,c= map(int, input().split())
num_list = [a,b,c]
prize = 0
if a==b and b==c:
    prize = 10000+a*1000

elif a!=b and a!=c and b!=c:
    prize = max(num_list)*100

elif a==b and b!=c:
    prize = 1000+a*100

elif a==c and a!=b:
    prize = 1000 + a * 100

elif b==c and a!=b:
    prize = 1000 + b * 100

print(prize)
