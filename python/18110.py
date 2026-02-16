import sys
input = sys.stdin.readline
n = int(input())

def real_round(num):
    if num - int(num) >=0.5:
        return int(num)+1
    else:
        return int(num)
    
if n==0:
    print(0)
    exit()    
num_array=[]

for _ in range(n):
    num_array.append(int(input()))
    

to_cut_num = real_round(len(num_array) * 0.15) 

num_array.sort()
if to_cut_num > 0:
    del num_array[0:to_cut_num]
    del num_array[len(num_array)-to_cut_num:]

return_result= sum(num_array)
return_result/=len(num_array)

print(real_round(return_result))