N , M ,K =map(int, input().split())


arr =[]

total=0
mini=0
for i in range(N+1):
    arr.extend((list(map(int,input().split()))))

arr.sort(reverse=True)

for _ in range(M+1):
    for _ in range(K+1):
        total+=arr[mini]
    total+=arr[mini+1]

print(total)        

    
    
    
