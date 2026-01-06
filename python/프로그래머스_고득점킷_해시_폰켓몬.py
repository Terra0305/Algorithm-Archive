def solution(nums):
    dict={} #포켓몬을 담을 딕셔너리
    can_get_num = int(len(nums)/2)#가져갈 수 있는 포켓몬의 수
    get_count=0 #현재 실제로 가져간 포켓몬의 수
    
    for current_pocketmon_num in nums:
        if current_pocketmon_num in dict:
            dict[current_pocketmon_num]+=1
        else:   
            dict[current_pocketmon_num]=1 
    
    pocketmon_types = len(dict)
    
    if pocketmon_types > can_get_num:
        answer = can_get_num
    else:
        answer = pocketmon_types

        
    return answer

print(solution([3,1,2,3]))

#1. 들어온 배열 원소의 갯수 세기. N/2마리를 가져간다 했으니 최우선적으로 구해야함.
#2. for문으로 순회하며 딕셔너리에 포켓몬 이름과 나온 횟수를 구한다.
# 가져갈수있는 마릿수가 찰때까지 나온횟수가 가장 낮은 포켓몬들을 pick. 종이 다르면 count+=1
