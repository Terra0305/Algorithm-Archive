import math

N, M = map(int, input().split())

card = [[0] * M for _ in range(N)]
result_min = []

for i in range(N):
    card[i]= list(map(int, input().split()))


for i in range(N):
    mini = float("inf")
    for j in range(M):
        if mini > card[i][j]:
            mini = card[i][j]
    result_min.append(mini)

result_min.sort(reverse=True)

print(result_min[0])
