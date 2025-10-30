import sys

input = sys.stdin.readline

input_data = input() 

count =0 
row = int(input_data[1]) 
column = ord(input_data[0]) - ord('a')+1

steps = [(-2,-1),(-2,1),(2,-1),(2,1),(-1,-2),(-1,2),(1,-2),(1,2)]

for step in steps:
    nextrow=row+step[0] 
    nextcol=column+step[1]
    
    if nextrow>=1 and nextcol>=1 and nextrow<=8 and nextcol<=8:
        count+=1
        

print(count)
    