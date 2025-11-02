N,M = map(int,input().split())


dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

start_y , start_x , start_see= map(int,input().split())
count=1

visited=[[0] * M for _ in range(N)]

graph = []
for i in range (N):
    graph.append(list(map(int, input().split())))

visited[start_y][start_x] = 1

