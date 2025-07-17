N = int(input())
scores = list(map(int,input().split()))

new_scores = [i/max(scores)*100 for i in scores]

print(sum(new_scores)/N)