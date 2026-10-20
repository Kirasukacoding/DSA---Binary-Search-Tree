// BINARY SEARCH TREE
// name: Syakira Agile M
// 001202500117

public class Main {

    public static void main(String[] args) {

        //CONSTRUCT BST
        BinarySearchTree tree = new BinarySearchTree();

        // INSERT
        tree.insert(new Node(1));
        tree.insert(new Node(2));
        tree.insert(new Node(4));
        tree.insert(new Node(7));
        tree.insert(new Node(5));
        tree.insert(new Node(6));
        tree.insert(new Node(9));
        tree.insert(new Node(3));
        tree.insert(new Node(8));

        // SEARCH
        System.out.println("Search 7: " + tree.search(7));     // Output: true
        System.out.println("Search 100: " + tree.search(100)); // Output: false

        // REMOVE / DELETE
        tree.remove(10);
        tree.remove(5);

        tree.display();
    }
}