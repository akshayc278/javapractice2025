import java.util.List;

public class QueueDefinations {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        length++;
    }

    public void dequeue() {

        if (isEmpty()) {
            return;
        } else {
            int val = head.data;
            System.out.println("Removed" + val);
            head = head.next;
        }
        length--;
    }

    public void printQueue() {
        ListNode travelsal = head;
        while (travelsal != null) {
            System.out.print(travelsal.data + " ");
            travelsal = travelsal.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDefinations queueDefinations = new QueueDefinations();
        queueDefinations.enqueue(11);
        queueDefinations.enqueue(12);
        queueDefinations.printQueue();

        queueDefinations.dequeue();
        queueDefinations.printQueue();
    }
}
