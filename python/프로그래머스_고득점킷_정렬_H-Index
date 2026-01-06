def solution(citations):
    answer = 0
    
    citations.sort(reverse= True)
    
    count=0
    for current_num in citations:
        if current_num >= count+1:
            count+=1
        else:
            break
    return count            
    

print(solution([3, 0, 6, 1, 5]))

# n번 이상이 인용된 논문이 n개 있는것중 최댓값 찾기
# 일단 오름차순 정렬을 한다음, count로 +=1씩 해가며 카운트와 인덱스가 일치하는 순간임.