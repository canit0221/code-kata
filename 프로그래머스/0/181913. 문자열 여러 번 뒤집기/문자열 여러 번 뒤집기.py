def solution(my_string, queries):
    string_list = list(my_string)
    
    for s,e in queries:
        string_list[s:e+1] = string_list[s:e+1][::-1]
        
    return ''.join(string_list)