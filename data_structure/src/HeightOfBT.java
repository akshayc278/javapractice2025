public class HeightOfBT {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public int heightOfBTFun(Node root) {
        if (root == null) {
            return 0;
        }
        int heightOfLeftTree = heightOfBTFun(root.left);
        int heightOfRightTree = heightOfBTFun(root.right);

        return Math.max(heightOfLeftTree, heightOfRightTree) + 1;

    }

    public void initializeNode() {
        root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        root.left = n1;
        n1.right = n2;
        root.right = n4;
        n2.left = n3;

    }

    private int heightOfBinaryTree() {
        return heightOfBTFun(root);
    }

    public static void main(String[] args) {
        HeightOfBT heightOfBT = new HeightOfBT();
        heightOfBT.initializeNode();
        int height = heightOfBT.heightOfBinaryTree();
        System.out.println(height);

    }


}
