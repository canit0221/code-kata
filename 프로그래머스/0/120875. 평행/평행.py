def solution(dots):
    def get_slope(a, b):
        # 분모가 0이 될 수 없으므로, 문제 조건상 x축, y축과 평행한 경우는 없다고 가정
        return (b[1] - a[1]) / (b[0] - a[0])
    
    # 가능한 세 가지 경우에 대해 기울기를 계산합니다.
    if get_slope(dots[0], dots[1]) == get_slope(dots[2], dots[3]):
        return 1
    if get_slope(dots[0], dots[2]) == get_slope(dots[1], dots[3]):
        return 1
    if get_slope(dots[0], dots[3]) == get_slope(dots[1], dots[2]):
        return 1
    return 0
