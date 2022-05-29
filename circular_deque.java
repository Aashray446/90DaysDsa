class circular_deque {

    int[] data;
    int front = -1;
    int rear = -1;
    int size = -1;
     
    public circular_deque(int k) {
        
        data = new int[k];
        size = k;
        
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()) {
            front = 0;
            rear = 0;   
            data[front] = value;
            return true;
        }  
        front = (front+size-1)%size;
        data[front] = value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
            data[rear] = value;
            return true;
        }
        
        rear = (rear+1)%size;
        data[rear] = value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        if(front  == rear) {
            rear = -1;
            front = -1;
            return true;
        }
        front = (front+1)%size;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        if(front  == rear) {
            rear = -1;
            front = -1;
            return true;
        }
        rear = (rear+size-1)%size;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }
    
    public int getRear() {
        
        if(rear == -1) {
            return -1;
        }
        return data[rear];
        
    }
    
    public boolean isEmpty() {
        if(front == -1 || rear == -1)
            return true;
        
        return false;
        
    }
    
    public boolean isFull() {
        if(isEmpty()){
            return false;
        }
        if((rear+1)%size == front) {
            return true;    
        }
        return false;
    }
}

/**
 * Your circular_deque object will be instantiated and called as such:
 * circular_deque obj = new circular_deque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */