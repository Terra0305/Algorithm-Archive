line = input()

all = set()
for i in range(len(line)):
    for j in range(i + 1,len(line)+1):
        all.add(line[i:j])
        
        
print(len(all))