import sys
import math

input = sys.stdin.readline

t = int(input())

for _ in range (t):
    line = list(map(int,input().split()))
    
    n = line[0]
    
    nums= line[1:]
    total_gcd=0
    
    for i in range(n):
        for j in range(i+1 , n):
            total_gcd +=math.gcd(nums[i],nums[j])
    print(total_gcd)
