def solution(arr):
    answer = []
    
    for current_num in arr:
        if len(answer) ==0:
            answer.append(current_num)
            continue    
        
        if current_num == answer[-1]:
            continue
        else:
            answer.append(current_num)
        
    return answer

print(solution([1,1,3,3,0,1,1]))