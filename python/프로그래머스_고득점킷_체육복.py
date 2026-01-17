def solution(n, lost, reserve):
    real_lost = sorted(list(set(lost)- set(reserve)))
    real_reserve = sorted(list(set(reserve)- set(lost)))
    
    answer = n - len(real_lost)
    
    for i in real_lost:
        if (i-1) in real_reserve:
            answer+=1
            real_reserve.remove(i-1)
        elif(i+1) in real_reserve:
            answer+=1
            real_reserve.remove(i+1) 
    return answer

print(solution(3	,[3]	,[1]))