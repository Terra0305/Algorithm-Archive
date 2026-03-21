N, M = map(int, input().split())

r, c, d = map(int, input().split())

val=0

room =[]

   #북,동,남,서 순서
dr=[-1,0,1,0]
dc=[0,1,0,-1]

def is_in_range(r,c):
    return 0<=r<N and 0<=c<M

for i in range(N):
    room.append(list(map(int,input().split())))
    
while True:
    if room[r][c] == 0:
        room[r][c] =2
        val+=1
    
    has_cleanable_spot = False
    
    for i in range(4):
        nr = r+dr[i]
        nc = c+dc[i]
        
        if is_in_range and room[nr][nc] ==0:
            has_cleanable_spot =True
            break
            
        
        if has_cleanable_spot:
            for _ in range(4):
                d = (d+3)%4
                
                nr = r+dr[d]
                nc = c+dc[d]
                
                if is_in_range(nr,nc) and room[nr][nc]==0:
                    r,c=nr,nc
                    break
        else:
            br =r -dr[d]
            bc = c-dc[d]
            
            if is_in_range(br,bc) and room[br][bc] !=1:
                r,c=br,bc
            else:
                print(val)
                exit()
    