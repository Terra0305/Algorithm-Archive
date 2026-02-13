from collections import deque
def solution(people, limit):
    people.sort()
    queue =deque(people)
    
    boat_count=0
    while queue:
        sum=0
        
        heavy = queue.pop()
        
        if queue and heavy + queue[0] <=limit:
            queue.popleft()
        
        boat_count+=1
        
    
                    
    return boat_count

print(solution([70, 50, 80, 50]	,100))