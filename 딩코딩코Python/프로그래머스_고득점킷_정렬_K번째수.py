def solution(array, commands):
    answer = []

    for current in commands:
        i = current[0] -1
        j = current[1] -1 
        k = current[2] -1 #인덱스를 가져와야하므로 -1을 해줘야함
        
        current_array = array[i:j+1]
        
        current_array.sort()
        
        answer.append(current_array[k])    
    
    
    return answer

print(solution([1, 5, 2, 6, 3, 7, 4],[[2, 5, 3], [4, 4, 1], [1, 7, 3]]))