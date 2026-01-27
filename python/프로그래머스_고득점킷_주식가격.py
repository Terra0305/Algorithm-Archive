from collections import deque
def solution(prices):
    
    queue =deque(prices)
    returnlist = []
    while len(queue)>0:

        current_num = queue.popleft() #큐에서 뽑은 숫자
        current_num_count=0
       
            
        for p in queue:
            if current_num > p:
                current_num_count+=1
                break
            else:
                current_num_count+=1
            
        returnlist.append(current_num_count)

    return returnlist

print(solution([1, 2, 3, 2, 3]))