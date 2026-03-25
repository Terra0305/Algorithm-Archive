

H,W = map(int,input().split())

#H = 가로 W=세로
graph= []
for _ in range(H):
    graph.append(list(input()))
    

for i in range(len(graph)):
    answer=""
    Ccnt=0
    check=False
    for current in graph[i]:
        if current =="c":
            answer+="0 " 
            check=True
            Ccnt=0
        elif current !="c" and check==True:
            Ccnt+=1
            answer+=str(Ccnt)+" "
        else:
            answer+="-1 " 
    print(answer)
    

