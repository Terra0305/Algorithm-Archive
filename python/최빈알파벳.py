def find_max_occurred_alphabet(string):
    alphabet_array=[0]*26
    max=0
    for char in string:
        if not char.isalpha():
            continue
        alphabet_index = ord(char) - ord('a')
        alphabet_array[alphabet_index]+=1
    
    for index in range(len(alphabet_array)):
        now_index = alphabet_array[index]
        if max<now_index:
            max=now_index
    return chr(alphabet_array.index(max)+ord('a'))
    
result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))