def solution(brown, yellow):
    answer = []
    total = brown + yellow
    for sero in range(3,int(total**0.5)+1):
        if total%sero ==0:
            garo = total//sero
            
            if (garo-2)*(sero-2) ==yellow:
                answer = [ garo,sero]
    
    return answer
print(solution(10,2))