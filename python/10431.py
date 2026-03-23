import sys

n = int(sys.stdin.readline())

for _ in range(n):
    data = list(map(int, sys.stdin.readline().split()))
    t_case = data[0]        # 테스트 케이스 번호
    students = data[1:]     # 실제 학생 20명의 키
    
    sorted_list = []        # 줄을 세울 빈 배열
    total_steps = 0         # 학생들이 뒤로 물러선 총 횟수
    
    for current_student in students:
        # 1. 현재 줄에 나보다 큰 학생이 있는지 확인
        found = False
        for i in range(len(sorted_list)):
            if sorted_list[i] > current_student:
                # 2. 나보다 큰 학생 중 가장 앞에 있는 학생(i번) 자리에 끼어들기
                # 그 뒤의 학생들은 자동으로 밀려나며, 그 수는 (현재 줄의 길이 - i)
                total_steps += (len(sorted_list) - i)
                sorted_list.insert(i, current_student)
                found = True
                break
        
        # 3. 나보다 큰 학생이 아무도 없다면 맨 뒤에 서기
        if not found:
            sorted_list.append(current_student)
            
    print(f"{t_case} {total_steps}")