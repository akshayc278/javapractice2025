public class DoublyLLDefinations {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLLDefinations() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void displayForwad(){
        if(head == null){
            return;
        }
        ListNode startNode = head;
        while(startNode!=null){
            System.out.print(startNode.data+" ");
            startNode=startNode.next;
        }

    }

    public void displayBackward(){
        if(head == null){
            return;
        }
        ListNode startNode = tail;
        while(startNode!=null){
            System.out.print(startNode.data+" ");
            startNode=startNode.previous;
        }

    }

    public void addAtEnd(int data){
        ListNode node = new ListNode(data);
        if(head == null){
            head=node;
            tail=node;
            length++;
            return;
        }
        tail.next=node;
        node.previous=tail;
        tail=node;
        length++;
    }

    public void addAtFront(int data){
        ListNode node =new ListNode(data);
        if(head == null){
            head=node;
            tail=node;
            length++;
            return;
        }
        head.previous =node;
        node.next=head;
        head=node;
        length++;
    }

    public static void main(String[] args) {
        DoublyLLDefinations doublyLLDefinations = new DoublyLLDefinations();
        doublyLLDefinations.addAtEnd(5);
        doublyLLDefinations.addAtEnd(8);
        doublyLLDefinations.addAtEnd(10);
        doublyLLDefinations.displayForwad();
        System.out.println();
        doublyLLDefinations.displayBackward();
        doublyLLDefinations.addAtFront(3);
        System.out.println();
        doublyLLDefinations.displayForwad();
    }
}

