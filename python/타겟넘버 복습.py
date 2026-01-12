def solution(numbers, target):
    
    leaves=[0]    
    for num in numbers:
        temp = []
        
        for leaf in leaves:
            temp.append(leaf + num)
            temp.append(leaf - num)
            
        leaves = temp
        
    
    return leaves.count(target)

print(solution([1, 1, 1, 1, 1],3))