def solution(answers):
    answer = []
    
    loser1 = [1,2,3,4,5]
    loser1_correct_count=0
    loser2= [2,1,2,3,2,4,2,5]
    loser2_correct_count=0
    loser3= [3,3,1,1,2,2,4,4,5,5]
    loser3_correct_count=0
    
    if len(answers)<=len(loser1):
        for i in range(len(answers)):
            if answers[i] == loser1[i]:
                loser1_correct_count+=1
    else:
        loser1 *= len(answers)//len(loser1)+1
        for i in range(len(answers)):
            if answers[i] == loser1[i]:
                loser1_correct_count+=1

    if len(answers)<=len(loser2):
        for i in range(len(answers)):
            if answers[i] == loser2[i]:
                loser2_correct_count+=1
    else:
        loser2 *= len(answers)//len(loser2)+1
        for i in range(len(answers)):
            if answers[i] == loser2[i]:
                loser2_correct_count+=1
            
    if len(answers)<=len(loser3):
        for i in range(len(answers)):
            if answers[i] == loser3[i]:
                loser3_correct_count+=1
    else:
        loser3 *= len(answers)//len(loser3)+1
        for i in range(len(answers)):
            if answers[i] == loser3[i]:
                loser3_correct_count+=1
    
    
    max_val = max(loser1_correct_count,loser2_correct_count,loser3_correct_count)
    
    if loser1_correct_count == max_val:
        answer.append(1)
    if loser2_correct_count == max_val:
        answer.append(2)
    if loser3_correct_count == max_val:
        answer.append(3)
        

    return answer

print(solution([1,2,3,4,5]))

# 1번 수포자:1,2,3,4,5 순서대로 2번수포자:2,1,2,3,2,4,2,5 반복 3번수포자:3,1,2,4,5 두번씩

# 문제의 갯수에 맞게 수포자 답 배열을 늘려야하나?..답 사이클을 한묶음씩만 묶어놓고,
# 입력되는 문제수까지 for문으로 늘려서 같은 배열사이즈로 만들어서 비교체크.

# 수포자별 답 찍는 사이클을 한묶음으로 해서, 그것보다 적거나 같으면(>=) 그냥 비교하면 되고,
# 많으면 그거에 맞게 배열을 이어붙히기(*하기로)