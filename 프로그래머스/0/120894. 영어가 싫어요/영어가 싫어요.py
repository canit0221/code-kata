def solution(numbers):
    diction = {
        "zero" : "0", "one" : "1", "two" : "2",
        "three" : "3", "four" : "4", "five" : "5",
        "six" : "6", "seven" : "7", "eight" : "8",
        "nine" : "9"
    };
    string = ''
    answer = ''
    for i in numbers:
        string += i
        
        if string in diction:
            answer += diction[string]
            string = ''
    answer = int(answer)
        
    return answer