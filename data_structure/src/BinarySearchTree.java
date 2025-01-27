public class BinarySearchTree {
    private ListNode root;

    private class ListNode {
        private int data;
        private ListNode left;
        private ListNode right;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        root = insertInSearchTree(root, data);
    }

    public ListNode insertInSearchTree(ListNode root, int data) {
        if (root == null) {
            root = new ListNode(data);
            System.out.println("Inserted value" + root.data);
            return root;
        }
        if (root.data > data) {
            root.left = insertInSearchTree(root.left, data);
        } else {
            root.right = insertInSearchTree(root.right, data);
        }
        return root;
    }

    public boolean serchKey(int data) {
        if (searchKeyBinary(root, data) != null) {
            return true;
        }
        return false;
    }

    public ListNode searchKeyBinary(ListNode root, int data) {
        if (root == null || root.data == data) {
            return root;
        }
        if (data < root.data) {
            return searchKeyBinary(root.left, data);
        } else {
            return searchKeyBinary(root.right, data);
        }
    }

    public void inOrder() {
        inorderPrint(root);
    }

    public void inorderPrint(ListNode root) {
        if (root != null) {
            inorderPrint(root.left);
            System.out.println(root.data);
            inorderPrint(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.inOrder();
        boolean keyPresent = binarySearchTree.serchKey(9);
        System.out.println(keyPresent);
    }
}
