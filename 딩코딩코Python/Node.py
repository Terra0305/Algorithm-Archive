
class Node:
    def __init__(self,data):
        self.data = data
        self.next= None
        
node = Node(3)
print(node.data, node.next)
        
    
class LinkedList:
    def __init__(self,value):
        self.head = Node(value)
        

linked_list = LinkedList(5)
print(linked_list.head.data)
