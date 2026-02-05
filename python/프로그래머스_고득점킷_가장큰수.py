def solution(numbers):
    answer = ''
    
    sorted_arry = sorted(numbers, key=lambda x : str(x)*3,reverse=True)
    
    for i in sorted_arry:
        answer+=str(i)
    
    
    check =0
    
    for i in numbers:
        if not i ==0:
            check+=1
            
    if check ==0:
        return "0"
    else:
        return answer