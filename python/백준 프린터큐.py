from collections import deque
n = int(input())

for _ in range(n):
    n,m = map(int, input().split())
    data = list(map(int, input().split()))
    queue = deque(enumerate(data))
    max_array = data.copy()
    max_array.sort(reverse=True)   
   
    print_count=1
    while queue:
        curr = queue.popleft()
        index = curr[0]
        value = curr[1] 
        
        if value == max_array[0]:
            if index == m:
                print(print_count)
                break
            else:
                max_array.pop(0)
                print_count+=1
        else:
            queue.append(curr)
