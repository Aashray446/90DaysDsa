import java.util.ArrayList;

class MinStack {
    
    ArrayList<Integer> arraylist;
    
    public MinStack() {
        arraylist = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        arraylist.add(val)
    }
    
    public void pop() {
        arraylist.remove(arraylist.size()-1);
    }
    
    public int top() {
        return arraylist.get(arraylist.size()-1);
    }
    
    public int getMin() {
        int min = arraylist.get(0);
        for (int integer : arraylist) {
            if(integer < min) {
                min = integer;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */