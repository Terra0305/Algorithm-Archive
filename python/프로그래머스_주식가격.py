from collections import deque


def solution(prices):
    returnlist = []
    prices = deque(prices)

    while len(prices) > 0:
        current_num = prices.popleft()
        current_num_count = 0

        for p in prices:
            
            if current_num>p:
                current_num_count+=1

                break
            else:
                current_num_count+=1
        returnlist.append(current_num_count)
            
            
    return returnlist


print(solution([1, 2, 3, 2, 3]))
