
public class BinarySearchTree {

    Node root;

    // INSERT
    public void insert(Node node) {

        root = insertHelper(root, node);

    }

    private Node insertHelper(Node root, Node node) {

        int data = node.data;

        if(root == null) {
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else if (data > root.data) {
            root.right = insertHelper(root.right, node);
        }

        //need to return something so just as a placeholder i'm going to return null
        //return null;
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root){
        if(root != null) {
            displayHelper(root.left); // if u want to reverse, change left to right
            System.out.println(root.data);
            displayHelper(root.right); // if u want to reverse, change right to left
        }

    }


    // SEARCH
    public boolean search(int data) {
         return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if(root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }


    // REMOVE
    public void remove(int data) {
        if(search(data)) {
            root = removeHelper(root, data);
        } else {
            System.out.println(data + ": could not be found!");
        }
    }

    public Node removeHelper(Node root, int data) {
        if(root == null) {
            return root;
        }
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else { // node found
            if (root.left == null && root.right == null) {
                root = null;
            }
            else if (root.right != null) { //find succesor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else { //find predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    // to rely on two separate methods one to find a successor and another to find a predessesor
    // this is in case we're detelting nodes we have to shift nodes around, so this will be private

    private int successor(Node root) {
        root = root.right;
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root) {
        root = root.left;
        while(root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}

