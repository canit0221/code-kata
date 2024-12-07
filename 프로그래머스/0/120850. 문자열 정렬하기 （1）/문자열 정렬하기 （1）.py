def solution(my_string):
    answer = []
    my_string = list(my_string) # 문자열 리스트 변환
    
    for i in my_string:
        if i.isdigit(): # i가 숫자면
            answer.append(int(i)) # i를 정수형타입으로 변환하고 answer리스트에 추가
    answer.sort() # 오름차순 정렬
    
    return answer