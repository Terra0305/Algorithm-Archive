def solution(n, computers):
    answer = 0
    visited= [False] * n 
    
    def dfs(node):
        visited[node] = True
        for neighbor , connected in enumerate(computers[node]):
            if connected ==1 and not visited[neighbor]:
                dfs(neighbor)
                
    
    for i in range(n):
        dfs(i)
        answer+=1
        
    return answer
        

print(solution(3,[[1, 1, 0], [1, 1, 0], [0, 0, 1]]))