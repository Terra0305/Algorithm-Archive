def find_max_occurred_alphabet(string):
    alphabet_array=[0]*26
    max=0
    
    for char in string:
        if not char.isalpha():
            continue
        alphabet_index= ord(char)-ord('a') #알파벳을 숫자로 변환시켜줌 
        alphabet_array[alphabet_index]+=1 #등장한 알파벳의 숫자 +1
    
    for index in range(len(alphabet_array)): #알파벳의 빈도를 담은 배열 순회      
        now_index = alphabet_array[index]
        
        if max < now_index:
            max=now_index #알파벳의 최빈값
            
        
    return chr(alphabet_array.index(max) + ord('a'))
                

result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))