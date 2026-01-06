def solution(clothes):
    
    answer = 1 #입을 수 있는 가짓수
    
    clothes_hash ={}
    for current in clothes:
        if current[1] in clothes_hash:
            clothes_hash[current[1]] +=1
        else:
            clothes_hash[current[1]] =1
    
    for clothes_type in clothes_hash:
        answer *= (clothes_hash[clothes_type]+1)
                
        
    return answer-1

print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))

#2차원 배열이 주어지며, 배열의 [1] 원소가 의상의 종류이다.
#해시맵에 Key를 [1]원소로 하여 의상 종류에 count를 더한다.
#하나도 안입는날이 있으면 안되므로 적어도 하나씩은 착용하도록 하고
#경우의수는 일단 n개는 1개씩 착용한다 치기때문에 최소 n개부터 시작이고, 
