from itertools import permutations
def solution(numbers):
    answer=0
    all_combinaion=set()
    num_array =[]
    for i in range(1,len(numbers)+1):
        for j in permutations(numbers,i):
            num = int("".join(j))
            all_combinaion.add(num)
            
    num_array = list(all_combinaion)
    
    for i in num_array:
        if is_prime(i):
            answer+=1
    return answer

def is_prime(num):
    if num<=1:
        return False
    if num==2:
        return True
    
    if num>=3:
        for i in range(3,int(num**0.5)+2):
            if num%i==0:
                return False
    return True
print(solution("17"))