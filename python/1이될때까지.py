N , K =map(int,input().split())

total =0

while N!=1:
    if N%K!=0:
        N-=1
        total+=1
        continue
    
    N/=K
    total+=1
print(total)


    