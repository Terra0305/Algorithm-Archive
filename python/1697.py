from collections import deque

N,K = map(int,input().split())

def bfs():
    dist = [-1] * 100001
    parent = [-1] * 100001
    queue=deque([N])
    dist[N] =0
    
    while queue:
        curr=  queue.popleft()
        
        if curr == K:
            print(dist[curr])
            
            path=[]
            temp=K
            while temp!=-1:
                path.append(temp)
                temp = parent[temp]
                
            print(*(path[::-1]))
            return            
                     
        for next in (curr+1,curr-1,curr*2):
            if 0<=next<=100000 and dist[next] == -1:
                dist[next] = dist[curr]+1
                parent[next] = curr
                queue.append(next)
                
bfs()