def solution(progresses, speeds):
    answer = []
    
    while len(progresses)>0:
        for i in range(len(progresses)):
            progresses[i]+=speeds[i]
        success=0
        
        while len(progresses)>0 and progresses[0]>=100:
            success+=1
            progresses.pop(0)
            speeds.pop(0)
        
        if success >0:
            answer.append(success)

    return answer

print(solution([93, 30, 55],[1, 30, 5]))