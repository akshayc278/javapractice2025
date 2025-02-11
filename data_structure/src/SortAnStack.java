import java.util.Stack;

public class SortAnStack {
    public void innerStackFill(Stack<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }
        if (st.peek() < value) {
            st.push(value);
            return;
        }
        int popValue = st.pop();
        innerStackFill(st, value);
        st.push(popValue);
    }

    public void sortAStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int popDigit = st.pop();
        sortAStack(st);
        innerStackFill(st, popDigit);
    }

    public static void main(String[] args) {
        SortAnStack sortAnStack = new SortAnStack();
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(9);
        st.push(1);
        st.push(3);
        st.push(2);

        //before sort 2 3 1 9 4 5
        sortAnStack.sortAStack(st);

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }

    }
}
