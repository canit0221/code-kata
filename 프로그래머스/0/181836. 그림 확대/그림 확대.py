def solution(picture, k):
    answer = []
    for row in picture:
        new_row = ""
        for pixel in row:
            new_row += pixel * k
        for i in range(k):
            answer.append(new_row)
    return answer