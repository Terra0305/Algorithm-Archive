student_names=["한결","윤수","성민","계율"]
student_heigts=[160,177,184,188]

def get_over_180_boys(heights):
    result=[]
    
    for i in range(len(student_heigts)):
        height =heights[i]
        
        if height>180:
            result.append(i)
    return result

over_indexes = get_over_180_boys(student_heigts)

for i in over_indexes:
    print(student_names[i])
    