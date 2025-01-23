public class CircularSingularLL {

    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSingularLL() {
        this.last = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void printLl() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data);
        System.out.println();
    }

    public void insertAtFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (last == null) {
            last = newNode;
            last.next = newNode;
            length++;
        } else {
            newNode.next = last;
            last.next = newNode;
            length++;
        }
    }

    public void insertAtLast(int data) {
        ListNode newNode = new ListNode(data);
        if (last == null) {
            insertAtFirst(data);
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
            length++;
        }
    }

    public static void main(String[] args) {
        CircularSingularLL cll = new CircularSingularLL();
        cll.insertAtFirst(2);
        cll.insertAtFirst(1);
        cll.printLl();
        cll.insertAtLast(5);
        cll.insertAtLast(9);
        cll.printLl();
        System.out.println(cll.length());
    }
}
