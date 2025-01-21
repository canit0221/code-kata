def solution(polynomial):
    answer = ''
    x_num = 0
    num = 0
    po = polynomial.replace(" ","")
    po = po.split("+")
    
    for i in po:
        if 'x' in i:
            if i[0] == "x":
                i = "1x"
            x_num += int(i[:-1])
        else:
            num += int(i)
            
    if x_num != 0 and num != 0:
        if x_num == 1:
            answer = f"x + {num}"
        else:
            answer = f"{x_num}x + {num}"
    elif x_num == 0 and num != 0 :
        answer = f"{num}"
    elif x_num ==0 and num ==0:
        answer = ""
    else:
        if x_num == 1:
            answer = "x"
        else:
            answer = f"{x_num}x"
    
    return answer