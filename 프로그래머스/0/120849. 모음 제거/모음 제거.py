def solution(my_string):
    answer = ''
    # my_string = list(my_string)
    remove = ['a','e','i','o','u']
    
    my_string = [i for i in my_string if i not in remove]

            
   
    answer = ''.join(my_string)
    
    
    return answer