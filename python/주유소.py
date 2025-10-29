n = int(input())

distnace =[]
price = []
min_price=float('inf')
total=0
distnace = list(map(int,input().split()))

price = list(map(int,input().split()))

for i in range(n-1):
    if min_price>price[i]:
        min_price = price[i]
        
    total+=min_price *distnace[i]
    
print(total)
        
    