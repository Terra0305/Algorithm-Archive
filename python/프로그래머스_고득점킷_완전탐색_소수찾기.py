from itertools import permutations

def solution(numbers):
    answer = 0
    num_array=[]
    
    all_combination = set()
    
    for i in range(1,len(numbers)+1):
        for p in permutations(numbers,i):
            num = int("".join(p))
            all_combination.add(num) 
            
    num_array = list(all_combination)
            
    for i in num_array:
        if is_prime(i):
            answer+=1
            
            
    
    return answer
    
            
    
        
def is_prime(n):
    if n<=1:
        return False
    
    if n==2:
        return True
    
    if n%2 ==0:
        return False
    
    for i in range(3,int(n**0.5)+1,2):
        if n % i==0:
            return False
        
    return True

    

print(solution("17"))