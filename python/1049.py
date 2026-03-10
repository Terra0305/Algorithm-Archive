N,M =map(int, input().split())  

min_price = 100000000
min_package = 100000000
min_Aanother=100000000
for _ in range(M):
    Package,Another = map(int, input().split())
    if Package < min_package:
        min_package  = Package
    if Another < min_Aanother:
        min_Aanother = Another
        
Package_1= (N // 6) * min_package + (min_Aanother*(N%6))
Package_2 = ((N//6)+1)* min_package
Another_val = N * min_Aanother #모두 개별구매
    
min_price = min(Package_1,Package_2,Another_val,min_price)    
    

print(min_price) 