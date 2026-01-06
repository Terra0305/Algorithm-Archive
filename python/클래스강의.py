class Person:
    pass
    def __init__(self, name_param):
        self.name= name_param
       
    
    def talk(self):
        print("안녕하세요",self.name,"입니다")
    
    
Person1 = Person("유재석")
Person1.talk()
Person2 = Person("박명수")
Person2.talk()