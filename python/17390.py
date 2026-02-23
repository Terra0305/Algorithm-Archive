import sys
input = sys.stdin.readline
N,Q = map(int,input().split())

A = list(map(int,input().split()))

A.sort()
sum_value=0

prefix_sum = [0]*(N+1)  

for i in range(N):
    prefix_sum[i+1] = prefix_sum[i] + A[i]
for i in range(Q):
    L,R=map(int,input().split())
    sum_value = prefix_sum[R] - prefix_sum[L-1]
    
    print(sum_value)