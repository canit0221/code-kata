def solution(myStr):
    myStr = myStr.split("a")  # 먼저 'a'를 기준으로 나눔
    myStr = [s for sub in myStr for s in sub.split("b")]  # 'b' 기준으로 한 번 더 나눔
    myStr = [s for sub in myStr for s in sub.split("c")]  # 'c' 기준으로 한 번 더 나눔
    myStr = [s for s in myStr if s != ""]  # 빈 문자열 제거

    return myStr if myStr else ["EMPTY"]  # 결과가 비어 있으면 ["EMPTY"] 반환