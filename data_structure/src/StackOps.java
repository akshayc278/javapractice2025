public class StackOps {
    Integer[] array = new Integer[10];
    int count = -1;

    public void push(int data) {
        if (count != 9) {
            count++;
            array[count] = data;

        } else {
            System.out.println("stack is full");
        }
    }

    public void pop() {
        if (count == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(count);
            int data = array[count];
            array[count] = null;
            count--;
            System.out.println("Pop" + data);
        }
    }

    public void printStack() {
        int i = 0;
        while (array[i] != null) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackOps stackOps = new StackOps();
        stackOps.pop();
        stackOps.push(1);
        //stackOps.printStack();
        stackOps.push(2);
        stackOps.push(3);
        stackOps.printStack();
        stackOps.pop();
        stackOps.printStack();
    }
}
