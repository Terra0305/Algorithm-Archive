n = int(input())
num_list =[]
for _ in range(n):
    num =int(input())
    
    answer =0
    
    arr = list(map(int, input().split()))
    zero_count=0
    positive_count=0   
    negative_count=0
    for current_num in arr:
        if current_num < 0:
            negative_count += 1
        elif current_num == 0:
            zero_count += 1
        else:
            positive_count += 1
    answer += zero_count
        
    if negative_count % 2 != 0:
        answer += 2
        
    print(answer)
            
         