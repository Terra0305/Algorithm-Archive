N = 1260
result =0

coin_types=[500,100,50,10]

for coin in coin_types:
    result+=N//coin
    N%=coin
print(result)


