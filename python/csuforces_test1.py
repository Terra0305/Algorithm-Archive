n = int(input())

for _ in range(n):
    current_string = input()
    sorted_array = sorted(current_string)
    
    result_aarray = "".join(sorted_array)
    
    check =0
    
    for current_alpha in range(len(result_aarray)-1):
        if ord(result_aarray[current_alpha]) +1== ord(result_aarray[current_alpha+1]):
            check+=1
    
    if len(result_aarray) ==1:
        print("Yes")
        continue
    if check == len(result_aarray)-1:
        print("Yes")
    else:
        print("No") 
        
        
       