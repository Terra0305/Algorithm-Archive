def solution(participant, completion):
    answer =''
    hash_map ={}
    for current_human in participant:
        if current_human in hash_map:
            hash_map[current_human]+=1
        else:
            hash_map[current_human]=1
    
    for current_human in completion:
        if current_human in hash_map:
            hash_map[current_human] -=1
            
    for current_name in hash_map:
        if hash_map[current_name] ==1:
            answer+=current_name
        
    
    return answer

print(solution(["leo", "kiki", "eden"],["eden", "kiki"]))