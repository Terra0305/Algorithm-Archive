from itertools import permutations

def solution(numbers):
    answer = 0
    num_array=[]
    all_combinations = set()
    
    for i in range(1,len(numbers)+1):
        for j in permutations(numbers,i):
            num = int("".join(j))
            all_combinations.add(num)
            
    num_array = list(all_combinations)
    
    for i in num_array:
        if is_prime(i):
            answer+=1
        
    
    return answer


def is_prime(num):
    if num<=1:
        return False
    if num==2:
        return True
    if num%2==0:
        return False
    
    for i in range(3,int(num**0.5)+1,2):
        if num%i==0:
            return False
    return True

print(solution("17"))