import sys

n = int(input())

problem_set = set()
for _ in range(n):
    line = sys.stdin.readline().split()
    command = line[0]

    if len(line)==2: #뒤에 숫자가 붙는 명령어
        num = int(line[1])
        if command == 'add':
            problem_set.add(num)
        elif command == 'remove':
            if num in problem_set:
                problem_set.remove(num)
        elif command == 'check':
            if num in problem_set:
                print(1)
            else:
                print(0)
        elif command =='toggle':
            if num in problem_set:
                problem_set.remove(num)
            else:
                problem_set.add(num)
                    
    else: # 안붙는 명령어 all,empty
        if command =='all':
            problem_set.update([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20])
        else:
            problem_set.clear()


            
        
