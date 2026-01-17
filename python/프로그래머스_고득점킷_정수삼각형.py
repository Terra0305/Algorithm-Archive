def solution(triangle):
    answer = 0
    max_val = 0 
    
    for i in reversed(range(len(triangle)-1)):
        for j in range(len(triangle[i])):
            max_val = max((triangle[i+1][j]) ,(triangle[i+1][j+1]))
            triangle[i][j]+= max_val
            
    answer = triangle[0][0]
    return answer

print(solution([[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]))