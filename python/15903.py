import heapq

cards = []

n,m=map(int,input().split())

cards = list(map(int,input().split()))

heapq.heapify(cards)


for i in range(m):
    first_val = heapq.heappop(cards)
    second_val = heapq.heappop(cards)
    
    add_val = first_val + second_val 
    heapq.heappush(cards,add_val)
    heapq.heappush(cards,add_val)
    
print(sum(cards))