def solution(numbers, target):
    leaves = [0]
    
    for current_num in numbers:
        
        temp=[]
        for leaf in leaves:
            temp.append(leaf+current_num) 
            temp.append(leaf-current_num)
        leaves = temp
    
    return leaves.count(target)