alpha = input()
alpha_Index=[-1]*26
for i in range(len(alpha)):
    index = ord(alpha[i])- ord('a')
    if alpha_Index[index]==-1:
        alpha_Index[index]= i

        
for  i in range(len(alpha_Index)):
    print(alpha_Index[i], end = " ")
        