input = "abadabac"

def find_not_repeating_first_character(string):
    alphbet_index = [0]*26
    for current_char in string:
        alphbet_index[ord(current_char)-ord('a')]+=1 #알파벳의 인덱스 +1 
    
    for i in string:
        if alphbet_index[ord(i)-ord('a')]==1:
            return i
        
    return "_"
        
        


result = find_not_repeating_first_character
print("정답 = d 현재 풀이 값 =", result("abadabac"))
print("정답 = c 현재 풀이 값 =", result("aabbcddd"))
print("정답 =_ 현재 풀이 값 =", result("aaaaaaaa"))