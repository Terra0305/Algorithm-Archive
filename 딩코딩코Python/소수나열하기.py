import math

input = 50


def find_prime_list_under_number(number):
    result_array = []
    for current_num in range(2,number+1): #전체 숫자를 하나씩 돌기. 
        isNotPrime=False
        for i in range(2,int(math.sqrt(current_num))+1): #숫자 하나씩 도는 로직.
            if current_num%i == 0:
                isNotPrime=True
        if isNotPrime==False:
            result_array.append(current_num)
            
    return result_array
        

result = find_prime_list_under_number(input)
print(result)
