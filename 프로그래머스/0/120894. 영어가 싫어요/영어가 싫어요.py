def solution(numbers):
    number_alpha = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    number_digit = list(range(0,10))
    
    diction = dict(zip(number_alpha,number_digit))
    
    string = ''
    answer = ''
    for i in numbers:
        string += i
        
        if string in diction:
            answer += str(diction[string])
            string = ''
    answer = int(answer)
        
    return answer