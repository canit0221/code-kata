def solution(my_string, alp):
    while alp in my_string:
        my_string = my_string.replace(alp,alp.upper())
    return my_string