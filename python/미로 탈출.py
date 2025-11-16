from collections import deque

row, col = map(int, input().split())

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

graph = []


for i in range(row):
    graph.append(list(map(int, input())))


def bfs(x, y):
    queue = deque()  # 큐 선언
    queue.append((x, y))

    while queue:
        current_x, current_y = queue.popleft()

        for i in range(4):
            nextX = current_x + dx[i]
            nextY = current_y + dy[i]

            if nextX < 0 or nextY < 0 or nextX >= row or nextY >= col:
                continue

            if graph[nextX][nextY] == 1:
                graph[nextX][nextY] = graph[current_x][current_y]+1
                queue.append((nextX, nextY))
            elif graph[nextX][nextY] == 0:
                continue


bfs(0, 0)

print(graph[row-1][col-1])
