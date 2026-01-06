def summarize_string(input_str):
    alphabet_array = [0]*26
    resultstring=""
    for i in input_str:
        alphabet_array[ord(i)-ord('a')]+=1 #해당하는 알파벳 인덱스를 카운팅해줌.
        
    idx=0
    for current_num in alphabet_array: #인덱스 배열을 하나하나 순회
        
        if current_num==0:
            idx+=1
            continue
        
        resultstring += chr(idx + ord('a')) + str(current_num)+("/")
        idx+=1
    return resultstring
                
        
            


input_str = "acccdeee"

print(summarize_string(input_str))