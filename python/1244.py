n = int(input())
switches = [0] + list(map(int, input().split()))

student_num = int(input())  

for current_student in range(student_num):
    sex,num = map(int,input().split())
    if sex == 1:
        for i in range(1, n + 1): # len(switches)+1 대신 n+1
            if i % num == 0:
                switches[i] = 1 - switches[i]   
        
        
    else:
        switches[num] = 1 - switches[num]
        left = num - 1
        right = num + 1
                
        while left>=1 and right<=n and switches[left]==switches[right]:
            switches[left] = 1 - switches[left]
            switches[right] = 1 - switches[right]
            left -= 1
            right += 1
for i in range(1, n + 1):
    print(switches[i], end=" ")
    if i % 20 == 0:
        print()