N = int(input())

people = []

for _ in range(N):
    w,h = map(int,input().split())
    people.append((w,h))
   
ranks =[]
 
for i in range(N):
    rank=1
    for j in range(N):
        if i == j:
            continue
    
        if people[j][0]>people[i][0] and people[j][1]>people[i][1]:
            rank+=1
    
    ranks.append(rank)


print(*ranks)
            
    
    