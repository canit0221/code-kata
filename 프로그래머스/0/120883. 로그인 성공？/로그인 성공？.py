def solution(j, db):
    answer = ''
    for i in db:
            if i[0] == j[0]:
                if i[1] == j[1]:
                    return 'login'
                else:
                    return 'wrong pw'
            else:
                answer = 'fail'
                    
    return answer