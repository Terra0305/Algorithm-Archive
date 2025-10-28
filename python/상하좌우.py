N = int(input())

x=1
y=1

command = input().split()

for i in range (len(command)):
    if(command[i] =='R'):
        if y>=1:
            y+=1
    elif(command[i]=='L'):
        if y>=1:
            y-=1
    elif(command[i]=='U'):
        if x>=2:
            x-=1
    elif(command[i]=='D'):
        if x>=1:
            x+=1
        

print(x," " ,y)