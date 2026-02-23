import sys 

input =sys.stdin.readline

line = input().strip()
result_sum=0


if len(line)==1:
    result_sum+=(ord(line) -ord('A'))+1
else:
    for i in range(len(line)):
            power = len(line) - 1 - i
            result_sum += (ord(line[i]) - ord('A') + 1) * (26 ** power)
        

print(result_sum)