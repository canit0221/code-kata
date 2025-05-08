N, K = map(int, input().split())
coins = [int(input()) for _ in range(N)]
coins.sort(reverse=True) # 큰 동전부터 사용하기 위해서

def greedy(N,K,coins):
	count = 0
	
	for coin in coins:
		if K == 0:
			break
		count += K // coin # 동전을 최대한 많이 사용
		K %= coin # 잔액
		
	print(count)
	return count

greedy(N,K,coins)