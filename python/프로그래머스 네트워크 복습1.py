from collections import deque
def solution(n, computers):
    answer = 0 
    
    visited =[False] * n
    
    queue = deque()
    for i in range(n):
        if not visited[i]:
            queue = deque([i])
            visited[i] = True
            while queue:
                curr = queue.popleft()
                
                for neighbor , connected in enumerate(computers[curr]):
                    if connected ==1 and not visited[neighbor]:
                        visited[neighbor] = True
                        queue.append(neighbor)
            answer+=1
    return answer
