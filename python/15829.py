n = int(input())
line = input()

sum = 0 

for i in range(len(line)):
    sum += ((ord(line[i]) - ord('a')) +1 )* 31 ** i
    
val = sum %1234567891
print(val)