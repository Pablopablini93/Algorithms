package BSTree;

public class BinarySearchTree {

    class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node(int data) {
            this.data = data;
        }

        public Node(){}
    }

    private Node root;

    public void add(int data) {
        Node node = new Node(data);
        if (this.root == null) {
            root = node;
        } else {
            add(this.root, node);
        }
    }

    private void add(Node parent, Node nodeToAdd) {
        if (nodeToAdd.data < parent.data) {
            if (parent.leftChild == null) {
                parent.leftChild = nodeToAdd;
            } else {
                add(parent.leftChild, nodeToAdd);
            }
        } else if (nodeToAdd.data > parent.data) {
            if (parent.rightChild == null) {
                parent.rightChild = nodeToAdd;
            } else {
                add(parent.rightChild, nodeToAdd);
            }
        }
    }

    public void traverse(String option) {
        if (option.toUpperCase().equals("ASCENDING")) {
            if (this.root != null) {
                Node currentNode = root;
                if (currentNode.leftChild != null)
                    traverseAscending(currentNode.leftChild);
                System.out.println(currentNode.data);
                if (currentNode.rightChild != null)
                    traverseAscending(currentNode.rightChild);
            }
        } else if (option.toUpperCase().equals("DESCENDING")) {
            if (this.root != null) {
                Node currentNode = root;
                if (currentNode.rightChild != null)
                    traverseDescending(currentNode.rightChild);
                System.out.println(currentNode.data);
                if (currentNode.leftChild != null)
                    traverseDescending(currentNode.leftChild);
            }
        }
    }

    private void traverseAscending(Node node) {
        if (node.leftChild != null) {
            traverseAscending(node.leftChild);
        }
        System.out.println(node.data);
        if (node.rightChild != null) {
            traverseAscending(node.rightChild);
        }
    }

    private void traverseDescending(Node node) {
        if (node.rightChild != null) {
            traverseAscending(node.rightChild);
        }
        System.out.println(node.data);
        if (node.leftChild != null) {
            traverseAscending(node.leftChild);
        }
    }
    

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(15);
        tree.add(100);
        tree.add(30);
        tree.add(8);
        tree.add(90);
        tree.add(12);
        tree.add(10);
        tree.add(150);
        tree.add(2);

        tree.traverse("DESCENDING");
    }
}