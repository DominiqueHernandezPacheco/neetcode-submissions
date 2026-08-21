class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    int min;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            minStack.push(val);
            min = val;
        } else {
            if (min < val) {
                stack.push(val);
                minStack.push(min);
            } else {
                min = val;
                stack.push(val);
                minStack.push(min);
            }
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        if(!minStack.isEmpty()){
            min = minStack.peek();
            }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
