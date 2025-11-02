import sys
input = sys.stdin.readline

def eratos(n):
    is_prime = [True]*(n+1)
    is_prime[0] = is_prime[1] = False
    i = 2
    while i*i <= n:
        if is_prime[i]:
            for j in range(i*i, n+1, i):
                is_prime[j] = False        
        i += 1
    return is_prime

Max = 1000000 
is_prime = eratos(Max) 

T = int(input())
for _ in range(T):
    N = int(input())
    count = 0
    for i in range(2, N//2+1):
        if is_prime[i] and is_prime[N - i]:
            count += 1
    print(count)