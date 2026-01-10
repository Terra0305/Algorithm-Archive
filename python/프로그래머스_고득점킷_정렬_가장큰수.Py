from collections import deque

def solution(priorities, location):
    answer = 0
   #current_location=0
    queue =deque()
    queue=deque(priorities) #중요도 배열을 큐에 담음.
    
    priorities.sort(reverse=True)
    priorities_current_count=0
    
    while queue:
        #1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
        current_num = queue.popleft() #이번에 나와야할 수
        location -= 1
        if current_num==priorities[priorities_current_count]:
            answer+=1
            priorities_current_count+=1

            if location<0:
                return answer
            
         #2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
        else:
            queue.append(current_num)
            
            if location<0:
                location = len(queue)-1
            
            #현재 문제점: 원하는 숫자가 나왔을떄 break 해야하는데, 그 로직이 없음.
            #만들더라도, 어떻게 중복을 걸러낼것인가...
    
    
    
    return answer

print(solution([1, 1, 9, 1, 1, 1],0))