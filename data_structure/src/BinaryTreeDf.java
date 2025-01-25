public class BinaryTreeDf {
    private ListNode root;

    private class ListNode {
        private int data;
        private ListNode left;
        private ListNode right;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void creteBT() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        root = node1;
        node1.left = node2;
        node2.right = node3;
        node1.right = node4;
        node4.right = node5;

//           1
//       /      \
//       2       4
//         \       \
//          3       5
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    public void inOrder(ListNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        inOrder(node.left);
        inOrder((node.right));
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    public void preOrder(ListNode node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.data + " ");
        preOrder((node.right));
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    public void postOrder(ListNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder((node.right));
        System.out.print(node.data + " ");

    }

    public static void main(String[] args) {
        BinaryTreeDf binaryTreeDf = new BinaryTreeDf();
        binaryTreeDf.creteBT();
        binaryTreeDf.preOrder();
        binaryTreeDf.inOrder();
        binaryTreeDf.postOrder();
    }
}
