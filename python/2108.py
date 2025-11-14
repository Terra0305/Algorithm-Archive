import statistics
import collections
N= int(input())

numList=[]

for _ in range(N):
    numList.append(int(input()))
    
numList.sort()

avg = statistics.mean(numList)
if avg >= 0:
    print(int(avg + 0.5))
else:
    print(int(avg - 0.5))
med = statistics.median(numList)
print(med)    

count_dict = collections.Counter(numList)

max_count = max(count_dict.values())

modes = []

for num , c in count_dict.items():
    if c == max_count:
        modes.append(num)

modes.sort()

if len(modes)>1:
    print(modes[1])
else:
    print(modes[0])

print(numList[len(numList)-1] - numList[0])
