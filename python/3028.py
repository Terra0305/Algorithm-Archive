Command = input()

list=[0]*3
list[0]=1

for i in range(len(Command)):
    if Command[i] =='A':
        list[0],list[1] = list[1],list[0]
    elif Command[i]=='B':
        list[1],list[2] = list[2],list[1]
    else:
        list[0],list[2] = list[2],list[0]

result=0
for i in range(3):
    if list[i] == 1:
        result = i
    
print(result+1)
        
    