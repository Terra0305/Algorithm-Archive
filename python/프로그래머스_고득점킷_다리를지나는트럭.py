from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    
    queue = deque(truck_weights) 
    bridge = deque([0] * bridge_length)
    current_bridge_weight = 0
    
    while bridge:
        answer+=1 
        
        exited_trucek = bridge.popleft()
        current_bridge_weight -= exited_trucek
        
        if queue:
            if current_bridge_weight + queue[0] <=weight:
                new_truck  = queue.popleft()
                bridge.append(new_truck)
                current_bridge_weight+= new_truck
            else:
                bridge.append(0)        
    return answer

print(solution(2,10,[7,4,5,6]))