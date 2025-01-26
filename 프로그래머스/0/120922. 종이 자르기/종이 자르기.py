def solution(M, N):
    paper = [M,N]
    paper.sort()
    answer = paper[0]-1+(paper[1]-1)*paper[0]
    
    return answer