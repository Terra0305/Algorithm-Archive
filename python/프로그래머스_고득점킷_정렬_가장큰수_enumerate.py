from collections import deque

def solution(priorities, location):
    answer = 0
    queue = deque((p, i) for i, p in enumerate(priorities))
    # p = 중요도, 매겨진 숫자
    priorities.sort(reverse=True)  # 비교를 위해 내림차순 정렬
    current_priorities_count = 0

    while queue:
        # 1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
        current_p, current_i = queue.popleft()
        # 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
        if current_p < priorities[current_priorities_count]:
            queue.append((current_p, current_i))
        # 3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
        else:
            answer += 1
            current_priorities_count += 1
            if current_i == location:
                return answer

    # return answer


print(solution([2, 1, 3, 2], 2))
