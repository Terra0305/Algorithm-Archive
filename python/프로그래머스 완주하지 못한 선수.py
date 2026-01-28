def solution(participant, completion):
    answer=' '
    
    hash = {}
    
    for current_player in participant:
        if current_player in hash:
            hash[current_player] +=1
        else:
            hash[current_player] =1 
    
    for current_player in completion:
        if current_player in hash:
            hash[current_player] -=1
        
    for current_player in hash:
        if hash[current_player] ==1:
            answer += current_player
            

    return answer

print(solution(["leo", "kiki", "eden"],["eden", "kiki"]))