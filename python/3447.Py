import sys 

for line in sys.stdin:
    line = line.rstrip()
    
    line_result = line
    
    while "BUG" in line_result:
        line_result = line_result.replace("BUG","")
        
    print(line_result)