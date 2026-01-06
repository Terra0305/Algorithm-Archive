import math
def solution(sizes):
    answer = 0
    max_val =0 
    second_val =0 #가장 큰값이 가로에 있었는지 세로에 있었는지 판별
    
    
    for current_size in sizes:
        current_horizon = max(current_size)
        current_virtical = min(current_size)
        
        #그냥 긴걸 다 가로로 둬버리기 . 짧은건 세로.
        
        if current_horizon>max_val:
            max_val = current_horizon
        
        if current_virtical>second_val:
            second_val = current_virtical
            
        answer = max_val * second_val
    
    return answer


print(solution([[60, 50], [30, 70], [60, 30], [80, 40]]))


#가로길이, 세로길이 모두 수납 가능하면서 가장 작아야함.
#어차피 제일 큰 값 하나는 가로로돌리든 세로로놓든 둬야하기때문에 , 하나는 고정.

#가장 큰 사이즈 하나 고르기. 그건 고정하고, 만약 가로였으면 나머지 세로에서 두번째로큰값이 사이즈가됨.
