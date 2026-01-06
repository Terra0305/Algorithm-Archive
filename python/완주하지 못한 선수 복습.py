def solution(participant, completion):
    hash_map={}
    answer = ''

    for i in participant:
        if i in hash_map:
            hash_map[i] +=1
        else:
            hash_map[i]=1
    
    for i in completion:
        if  i in hash_map:
            hash_map[i] -=1
        
        
    for current_name in hash_map:
        if hash_map[current_name]==1:
            answer+=current_name
    
    
            

    return answer

print(solution(["leo", "kiki", "eden"],["eden", "kiki"]))