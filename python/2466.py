N = int(input())

spacecount=0
def recursive(n):
    if n == 1:
        return ""
    space = " "*spacecount
    
    spacecount+=1
    