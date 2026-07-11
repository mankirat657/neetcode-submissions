class MinStack {
    Stack<Integer> minStack;
    Stack<Integer>minimum;
    public MinStack() {
        minStack = new Stack<Integer>();
        minimum = new Stack<Integer>();
    }
    
    public void push(int val) {
       if(minimum.isEmpty()){
        minimum.push(val);
       }
       else{
        minimum.push(Math.min(val,minimum.peek()));
       }
       minStack.push(val);
    }
    
    public void pop() {
        int va = minStack.pop();   
        minimum.pop();
    }
    
    public int top() {
       return minStack.peek();
    }
    
    public int getMin() {
        return minimum.peek();
    }
}
