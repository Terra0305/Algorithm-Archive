import heapq
def solution(scoville, K):
    answer = 0
    
    heapq.heapify(scoville)
    while len(scoville)>=2:    
        first_min = heapq.heappop(scoville)
        
        if first_min>=K:
            return answer
        second_min = heapq.heappop(scoville)
        heapq.heappush(scoville,first_min + ((second_min)*2))
        answer+=1 
    if scoville[0] < K:
        return -1
    return answer

print(solution([1, 2, 3, 9, 10, 12],7))