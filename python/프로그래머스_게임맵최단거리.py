from collections import deque   
def solution(maps):
    answer = -1
    n = len(maps)
    m = len(maps[0])
    visited = [[False] * len(maps[0]) for _ in range(len(maps))]
    queue = deque()

    queue.append((0,0,1))
    dx=[1,-1,0,0]
    dy=[0,0,1,-1]
    while queue:
        current_x, current_y , dist = queue.popleft()
        
        if current_x == n-1 and current_y ==m-1:
            return dist

        if visited[current_x][current_y]:
            continue
        visited[current_x][current_y] =True
        
        
         
        for i in range(4):
            nx = current_x + dx[i]
            ny = current_y + dy[i]
            
            if 0<=nx<n and 0<= ny <m:
                if maps[nx][ny] ==1 and not visited[nx][ny]:
                    queue.append((nx,ny,dist+1))
        
            
    return answer


print(
    solution(
        [
            [1, 0, 1, 1, 1],
            [1, 0, 1, 0, 1],
            [1, 0, 1, 1, 1],
            [1, 1, 1, 0, 1],
            [0, 0, 0, 0, 1],
        ]
    )
)
