import sys
input = sys.stdin.readline

N, K = map(int, input().split()) 
sound = list(map(int, input().split()))

Handclapcount = 1 
clap_end_time = sound[0] + K

for i in range(1, N):
    if sound[i] > clap_end_time: 
        Handclapcount += 1
        clap_end_time = sound[i] + K

print(Handclapcount)