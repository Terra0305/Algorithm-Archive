def solution(progresses, speeds):
    answer = []
    
    while len(progresses) > 0:
      
        for i in range(len(progresses)):
            progresses[i] += speeds[i]

        successs = 0
        
        while len(progresses) > 0 and progresses[0] >= 100:
            successs += 1
            progresses.pop(0)
            speeds.pop(0)

        if successs > 0:
            answer.append(successs)

    return answer

print(solution([93, 30, 55], [1, 30, 5])) 