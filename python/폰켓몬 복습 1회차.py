def solution(nums):
    
    can_get_num = int(len(nums)/2)
    
    hash_map ={}
    
    for current_pocket_num in nums:
        if current_pocket_num in hash_map:
            hash_map[current_pocket_num]+=1
        else:
            hash_map[current_pocket_num]=1
    
    pocketmon_types = int(len(hash_map))  
    
    if pocketmon_types>can_get_num:
        answer = can_get_num
    else:
        answer = pocketmon_types 

    
    return answer

print(solution([3,1,2,3]))