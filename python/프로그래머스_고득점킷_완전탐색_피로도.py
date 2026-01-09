from itertools import permutations

def solution(k,dungeons):
    answer = -1
    
    max_val=0
    
    for i in permutations(dungeons,len(dungeons)):
        current_k = k
        can_visit_dungeons =0 #돈 던전 갯수
        for current_dungeon in i:
            

            min_pirodo= current_dungeon[0] #최소필요 피로도
            somo_pirodo =current_dungeon[1] #소모 피로도
            
            if current_k>= min_pirodo:
                current_k-= somo_pirodo #최소 필요 피로도보다 높거나 같으면 던전돌기 
                can_visit_dungeons +=1 
            else:
                break
            if max_val<can_visit_dungeons:
                max_val = can_visit_dungeons
            
            
        
    answer=max_val
        
    return answer

print(solution(80,([[80,20],[50,40],[30,10]])))