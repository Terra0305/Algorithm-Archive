import math

n,m = map(int,input().split())

arr = [[0]*m for _ in range(n)]

minarr =[]

for i in range(n):
    row_data=list(map(int,input().split()))
    
    a=min(row_data)
    minarr.append(a)
    
print(max(minarr))    
