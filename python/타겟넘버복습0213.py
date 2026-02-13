def solution(numbers, target):
    answer = 0
    leaves=[]
    
    for current_num in numbers:
        temp= []
        
        for leaf in leaves:
            temp.append(leaf+current_num)
            temp.append(leaf-current_num)   
        leaves= temp
        
    
    return answer