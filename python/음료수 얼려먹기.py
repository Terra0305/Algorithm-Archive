row, col = map(int, input().split())

graph = []

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

for i in range(row):
    graph.append(list(map(int, input())))

visited = [[False for _ in range(col)] for _ in range(row)]

count=0

def DFS(x, y):
    visited[x][y] =True
    
    for i in range (4):
        nextX= x+dx[i]
        nextY= y+dy[i]
        if nextX<0 or nextY<0 or nextX>=row or nextY>=col:
            continue
            
        if not visited[nextX][nextY] and graph[nextX][nextY]==0:
            DFS(nextX,nextY)

for i in range(row):
    for j in range(col):
        if not visited[i][j] and graph[i][j]==0:
            DFS(i,j)
            
            count+=1
            
        
print(count)
    