import sys

input = sys.stdin.readline

ISBN = input().strip()
sum = 0
star_inedx=0 
       
for i in range(len(ISBN)):
    if i%2 ==0: #짝수 인덱스일때 1배수
        if not ISBN[i] =='*':
            sum+=int(ISBN[i])
        else:
            star_inedx = i
    else:  #홀수 인덱스일때 3배수
        if not ISBN[i]== '*':
            sum+=(int(ISBN[i]))*3
        else:
            star_inedx = i
    

for i in range(10):
    if star_inedx%2==0:
        if (sum+i) % 10 ==0:
            print(i)
            break
    else:
        if (sum+i*3) %10 ==0:
            print(i)
            break
    
    