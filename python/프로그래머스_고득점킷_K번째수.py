def solution(array, commands):
    answer = []
    temp = []
    for current_list in commands:   
        i = current_list[0]
        j = current_list[1]
        k = current_list[2]
        
        for cur in range(len(array)):
            while i-1<= cur <= j-1:
                temp.append(array[cur])        
        temp.sort()
        
        answer.append(temp[k-1])
    return answer

print(solution([1, 5, 2, 6, 3, 7, 4] , [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))