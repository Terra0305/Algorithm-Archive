from collections import deque
def solution(begin, target, words):
    if target not in words:
        return 0
    
    queue = deque([(begin,0)])
    visited = [False] * len(words)
        
    while queue:
        current_word , step = queue.popleft()
        
        
        if current_word == target:
            return step
        
        for i in range(len(words)):
            if not visited[i]:
                different_word =0
                for j in range(words[i]):
                    if current_word[j] != words[i][j]:
                        visited[i]= True
                        queue.append((words[i],step+1))
    return 0