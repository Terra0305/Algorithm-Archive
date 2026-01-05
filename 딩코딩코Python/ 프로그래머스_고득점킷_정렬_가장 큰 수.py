def solution(numbers):
    answer = ''
    sumcount =0
    numbers.sort(key = lambda x: str(x) * 3,reverse =True) 
    
    for current_num in numbers:
        answer+=str(current_num)
        
    check = 0
    
    for i in numbers:
        if not i ==0 :
            check+=1
    
    if check==0:
        return "0"
    else:
        return answer


print(solution([6,10,2]))

#첫번째 조건 앞에 0은 오지않게 할것. 최대한 앞부터 높은숫자 붙일것. 
#숫자의 크기는 상관없고 first 숫자(가장 앞 숫자가 높아야 합쳤을떄 높은수가 될 수 있음)
#문자열로 바꾸고 