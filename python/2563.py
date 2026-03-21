n = int(input())
arr =[[False]*100 for _ in range(100)]

for current in range(n):
    x,y = map(int,input().split())
    for i in range(x,min(100,x+10)):
        target_end = min(y+10,100)
        num_to_change = target_end - y
        arr[i][y:target_end] = [True] * num_to_change
    
    
val = 0 
for i in range(100):
    for j in range(100):
        if arr[i][j] ==True:
            val+=1
            
print(val)