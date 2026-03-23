def sol(n):
    dp =[0] *1000001

    if n==1:
        return 0
    elif n==2:
        return 1
    elif n==3:
        return 1
    dp[1] = 0
    dp[2] = 1
    dp[3] = 1
    
    for i in range(4,n+1):
        min_val = dp[i-1]
        
        
        if i%2==0:
            min_val = min(dp[i//2],min_val)
        if i%3==0:
            min_val = min(dp[i//3],min_val)
            
        dp[i] = min_val+1
    return dp[n]
n=int(input())

print(sol(n))