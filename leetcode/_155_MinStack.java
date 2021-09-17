class _155_Min_Stack {
    // ! Không đúng trên leetcode
    private int[] array;
    private int SIZE;
    private int topIndex;

    public _155_Min_Stack(int size) {
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    public boolean isEmpty() {
        return topIndex < 0;
    }

    public void push(int val) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = val;
            System.out.print(array[topIndex] + " ");
        } else {
            System.out.println();
            System.out.println(" Arrays is Full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            int val = array[topIndex];
            topIndex--;
            System.out.println("pop-out value: " + val);
        } else
            System.out.println("Arrays is Empty");
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Arrays is Empty");
        }
        return array[topIndex];
    }

    public int getMin() {
        int minVal = array[topIndex];
        if (!isEmpty()) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minVal) {
                    minVal = array[i];
                } else
                    return minVal;
            }
        } else {
            System.out.println("Arrays is Empty");
        }
        return minVal;
    }

    public static void main(String[] args) throws Exception {
        _155_Min_Stack objStack = new _155_Min_Stack(3);
        objStack.push(-2);
        objStack.push(0);
        objStack.push(-5);
        objStack.push(-4);
        System.out.println("Min: " + objStack.getMin());
        System.out.println("Value-Top: " + objStack.top());
        objStack.pop();
        System.out.println("Value-Top: " + objStack.top());
        System.out.println("Min: " + objStack.getMin());
    }
}