def solution(n):
    zero = [[0 for _ in range(n)] for _ in range(n)]
    row, col = 0, 0
    num = 1

    while num <= n * n:
        # 오른쪽
        while col < n and zero[row][col] == 0:
            zero[row][col] = num
            num += 1
            col += 1
        col -= 1
        row += 1

        # 아래
        while row < n and zero[row][col] == 0:
            zero[row][col] = num
            num += 1
            row += 1
        row -= 1
        col -= 1

        # 왼쪽
        while col >= 0 and zero[row][col] == 0:
            zero[row][col] = num
            num += 1
            col -= 1
        col += 1
        row -= 1

        # 위
        while row >= 0 and zero[row][col] == 0:
            zero[row][col] = num
            num += 1
            row -= 1
        row += 1
        col += 1

    return zero
