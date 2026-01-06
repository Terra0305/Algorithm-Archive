def solution(s):
    answer = True
    stack =[]
    for current in s:
        if current == "(":
            stack.append(current)
        elif current ==")":
            
            if len(s) >= 1:
                if len(stack)==0:
                    return False
                stack.pop()
            else:
                return False
            
    if len(stack)==0:
        return True
    else:
        return False

print(solution("(()("))