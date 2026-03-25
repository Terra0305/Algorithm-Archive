def sol(k):

    dp = [0] * 91
    if k == 1 :
        return 1
    if k== 2:
        return 1
    
    dp[1] = 1
    dp[2] = 1
    for i in range(3,k+1):
        dp[i] = dp[i-1] + dp[i-2]
        
    return dp[k]


n = int(input())
print(sol(n))