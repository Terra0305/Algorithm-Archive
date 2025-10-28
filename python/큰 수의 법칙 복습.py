N, M ,K = map(int, input().split())

arr = list(map(int,input().split()))

sum=0

arr.sort(reverse=True)

while True:
    if M ==0:
        break
    for _ in range(K):
        sum+= arr[0]
        M-=1
    
    sum+=arr[1]
    M-=1   
    
    
print(sum)