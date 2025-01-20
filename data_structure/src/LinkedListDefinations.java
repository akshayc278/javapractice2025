public class LinkedListDefinations {

    private Node head;

    private static class Node {
        private int value;
        private Node next;

        public Node(int data) {
            this.value = data;
            this.next = null;
        }
    }


    private void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newHead = head;
        while (newHead.next != null) {
            newHead = newHead.next;
        }
        newHead.next = new Node(data);
    }

    private void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    private void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        int count = 0;
        position--;
        if (position == 0) {
            insertAtFirst(data);
            return;
        }
        Node headNode = head;
        while (headNode != null) {
            count++;
            if (count == position) {
                Node nextNodes = headNode.next;
                headNode.next = newNode;
                newNode.next = nextNodes;
            } else
                headNode = headNode.next;
        }
    }

    private void deleteFirst() {
        Node headNode = head;
        if (headNode != null) {
            head = headNode.next;
            headNode.next = null;
        }
    }

    private void deletAtPosition(int position) {
        Node headNode = head;
        if (position == 1) {
            deleteFirst();
            return;
        }
        int count = 1;
        //Node prevNode = headNode;
        while (headNode != null) {
            count++;
            Node prevNode = headNode;
            headNode = headNode.next;
            if (count == position && headNode != null) {
                prevNode.next = headNode.next;
                headNode.next = null;
            }
        }
    }

    private int findMidOfList() {
        Node headNode = head;

        Node midNode = new Node(0);
        midNode.next = headNode;

        int count = 1;
        while (headNode != null) {

            if (count % 2 != 0) {
                midNode = midNode.next;
            }
            headNode = headNode.next;
            count++;
        }
        return midNode.value;
    }

    public void printList() {
        Node headNode = head;
        while (headNode != null) {
            System.out.print(headNode.value + " ");
            headNode = headNode.next;
        }
    }


    public static void main(String[] args) {
        LinkedListDefinations linkedListDefinations = new LinkedListDefinations();
        linkedListDefinations.insert(5);
        linkedListDefinations.insert(6);
        linkedListDefinations.insert(7);
        linkedListDefinations.insertAtFirst(9);
        linkedListDefinations.insertAtPosition(2, 4);
        linkedListDefinations.insertAtPosition(4, 1);
        linkedListDefinations.insertAtPosition(10, 10);
        linkedListDefinations.deleteFirst();
        linkedListDefinations.deletAtPosition(3);
        System.out.println(linkedListDefinations.findMidOfList());
        linkedListDefinations.printList();
    }

}
