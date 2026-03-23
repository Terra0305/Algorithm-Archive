N,K = map(int,input().split())

coins =[]
prev_k =0 #더해가는 변수 
cnt=0
for _ in range(N):
    coins.append(int(input()))
    
coins.sort(reverse=True)

for coin in coins:
    if K==0:
        break    
    
    if K>=coin:
        cnt+=K//coin
        K%=coin
print(cnt)
                
    
