def solution(str_list):
    answer = [] 
    try:
        if str_list.index("l") < str_list.index("r"):
            answer = str_list[:str_list.index("l")]
        elif str_list.index("l") > str_list.index("r"):
            if str_list[-1] == "r":
                pass
            else:
                answer = str_list[str_list.index("r")+1:]
    except:
        if "l" in str_list:
            if str_list[0] == "l":
                pass
            else:
                answer = str_list[:str_list.index("l")]
        elif "r" in str_list:
            try:
                answer = str_list[str_list.index("r")+1:]
            except:
                pass
        else:
            pass

    return answer