# Binary Search Tree (BST) Implementation in Java

**Course**: Data Structures & Algorithms (DSA)  
**Name**: Syakira Agile Mumtaz  
**Student ID**: 001202500117  

---

## 📌 Features & Assignment Requirements

This Java program implements a complete Binary Search Tree (BST) fulfilling four core operations:

1. **Construct BST**
   - Initializes an empty BST instance (`BinarySearchTree tree = new BinarySearchTree()`) and constructs the tree structure by inserting nodes.
2. **Insert a key to the BST**
   - Recursively places new keys based on standard BST properties (smaller values to the left, larger values to the right).
3. **Delete a key from the BST**
   - Handles all three standard BST deletion cases:
     - Leaf node deletion
     - Node with a single child
     - Node with two children (using In-order Successor / Predecessor)
4. **Search a key in the BST**
   - Recursively searches for a target value and returns whether it exists (`true`/`false`).

---

## 🚀 How to Run

1. Compile the Java files:
   ```bash
   javac Node.java BinarySearchTree.java Main.java
   ```

2. Run the main program:
   ```bash
   java Main
   ```

---

## 💻 Sample Output

```text
Search 7: true
Search 100: false
10: could not be found!

Tree contents after deletion:
1
2
3
4
6
7
8
9
```
