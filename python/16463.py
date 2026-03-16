year = int(input())

day = 2
current_month = 1
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
answer = 0
for current_year in range(2019, year + 1):
    Yun = False

    if current_year % 400 == 0:  # 윤년 측정
        Yun = True
    elif not current_year % 400 == 0 and current_year % 100 == 0:
        Yun = False
    elif not current_year % 100 == 0 and current_year % 4 == 0:
        Yun = True

    if Yun == True:
        days[1] = 29
    else:
        days[1] = 28

    for m in range(12):
        to_know_day = (day + 12) % 7
        
        if to_know_day == 5:
            answer+=1
            
        day = (day+days[m])%7

print(answer)
