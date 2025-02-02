def solution(board):
    n = len(board)
    answer = n*n
    
    mine = [[0]*n for j in range(n)] # 빈배열
    
    for i in range(n):
        for j in range(n):
            # 현재 칸에 지뢰(1)가 있다면
            if board[i][j] == 1:
                # 지뢰 범위(min,max로 테두리에 대해서 범위제한)
                for row in range(max(0, i - 1), min(n, i + 2)):
                    for col in range(max(0, j - 1), min(n, j + 2)):
                        mine[row][col] = 1
    
    for i in mine:
        answer -= sum(i) #안전 범위
    
    return answer
                        
    