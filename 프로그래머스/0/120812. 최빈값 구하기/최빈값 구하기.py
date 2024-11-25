def solution(array):
    counts = {}
    for i in set(array):
        counts[i] = array.count(i)
    
   
    max_count = max(counts.values())
    modes = [key for key, value in counts.items() if value == max_count]
    
    if len(modes) > 1:
        return -1
    else:
        return modes[0] 
