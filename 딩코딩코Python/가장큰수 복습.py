def solution(numbers):
    answer=''
    
    
    numbers.sort(key=lambda x:str(x)*3 , reverse= True)
    
    for current_num in range(len(numbers)):
        answer +=str(numbers[current_num])
    
    if answer[0] =='0':
        return 0
    else:
        return answer
    
print(solution([6, 10, 2]))