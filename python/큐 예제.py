from collections import deque

queue = deque()
queue.append(5)

# deque([5]) 말고 [5]가 나옴
print(list(queue))