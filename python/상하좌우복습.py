N = int(input())

command = input().split()

dx = [0,0,-1,1]
dy = [-1,1,0,0]
dr = ['L','R','U','D']

x=1
y=1

for plan in command:
    for i in range(len(dr)):
        if plan ==dr[i]:
            nextx=x+dx[i]
            nexty=y+dy[i]
    if nextx<1 or nexty<1 or nextx>N or nexty>N:
        continue
    
    x, y = nextx ,nexty
    
print(x,y)
        
