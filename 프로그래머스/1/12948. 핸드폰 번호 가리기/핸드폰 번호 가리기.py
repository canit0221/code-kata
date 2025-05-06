def solution(phone_number):
    masking = '*'*(len(phone_number)-4)
    number = phone_number[-4:]
    answer = masking + number
    return answer