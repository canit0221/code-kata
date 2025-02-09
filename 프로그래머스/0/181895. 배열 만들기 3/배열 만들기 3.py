def solution(arr, j):
    answer = []
    for i in range(j[0][0],j[0][1]+1):
        answer.append(arr[i])
    for i in range(j[1][0],j[1][1]+1):
        answer.append(arr[i])

    return answer