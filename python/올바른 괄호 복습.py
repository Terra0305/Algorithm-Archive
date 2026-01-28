def solution(s):
    
    answer =True
    stack = []
    for current in s:
        if current =='(':
            stack.append(current)
        
        elif current ==')':
            if len(stack)>0:
                stack.pop()
            else:
                return False
            
    if len(stack)>0:
        answer = False       
    return answer


print(solution(")()("))