hour, minute = map(int, input().split())

if minute >= 45:
    minute -= 45
else:
    minute = (minute + 60) - 45
    if hour == 0:
        hour = (hour + 24) - 1
    else:
        hour -= 1

print(hour, minute)
