def solution(participant, completion):
    hash_map={}
    
    for current_name in participant:
        if current_name in hash_map:
            hash_map[current_name]+=1
        else:
            hash_map[current_name]=1
    
    for current_name in completion:
        if current_name in hash_map:
            hash_map[current_name]-=1
        
              
    answer = ''
    
    for current_name in hash_map:
        if hash_map[current_name] ==1:
            answer += current_name
            

    return answer
    
    
    
print(solution(["leo", "kiki", "eden"],["eden", "kiki"] ))
                    #전체 선수 명단         완주한 선수 명단 
                    
                    
#idea: 딕셔너리의 del 기능을 활용하여 전체선수 명단에서 완주한 선수 명단을 빼버리기.
#그러면 남은 선수 이름은 자연스럽게 완주하지 못한 선수 이름이 된다.