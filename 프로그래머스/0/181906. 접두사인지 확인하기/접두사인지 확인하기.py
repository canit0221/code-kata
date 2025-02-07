def solution(my_string, is_prefix):
    tmp = ''
    for i in my_string:
        tmp += i
        if tmp == is_prefix:
            return 1
    return 0