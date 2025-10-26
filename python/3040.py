arr = []

for _ in range(9):  # 9번 입력받기
    arr.append(int(input()))

total_sum = sum(arr)

fake1 = -1
fake2 = -1
for i in range(9):
    for j in range(i+1, 9):
        if total_sum - (arr[i] + arr[j]) == 100:
            fake1 = arr[i]
            fake2 = arr[j]
            break
    
    if(fake1!=-1):
        break


arr.remove(fake1)
arr.remove(fake2)

for i in range(len(arr)):
    print(arr[i])
    
