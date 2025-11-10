import sys

N , M =sys.stdin.readline().split()
M= int(M)
result = (N * int(N))

print(result[:M])