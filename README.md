# Binary Search Tree (BST) - Java Implementation

A clean, modular, and lightweight implementation of the **Binary Search Tree (BST)** data structure written in Java.

---

## 📖 Overview

A **Binary Search Tree** is a node-based binary tree data structure where each node has at most two children, following the fundamental BST ordering property:
- The **left subtree** of a node contains only keys lesser than the node's key.
- The **right subtree** of a node contains only keys greater than the node's key.
- Both left and right subtrees must also be binary search trees.

This project demonstrates core tree operations implemented recursively with clean separation of concerns.

---

## ✨ Features

- **Insertion (`insert`)**: Adds nodes dynamically while maintaining BST ordering properties.
- **Search (`search`)**: Efficient logarithmic lookup returning a boolean status.
- **Deletion (`remove`)**: Handles all three standard structural deletion cases:
  1. **Leaf Node**: Direct removal without restructuring.
  2. **Single Child**: Automatically splices the child node into place.
  3. **Two Children**: Replaces target node with its *In-order Successor* or *Predecessor* to preserve tree balance.
- **Traversal (`display`)**: In-order traversal yielding elements in sorted ascending order.

---

## 📁 Project Structure

```text
├── Node.java              # Definition of tree node (data, left, right pointers)
├── BinarySearchTree.java  # Core BST operations and recursive helper algorithms
└── Main.java              # Demonstration driver and test execution
```

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK 8 or higher)
- Git

### Build & Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Kirasukacoding/DSA---Binary-Search-Tree.git
   cd DSA---Binary-Search-Tree
   ```

2. **Compile the source files:**
   ```bash
   javac Node.java BinarySearchTree.java Main.java
   ```

3. **Execute the program:**
   ```bash
   java Main
   ```

---

## 💻 Example Usage

```java
BinarySearchTree tree = new BinarySearchTree();

// Insert values
tree.insert(new Node(50));
tree.insert(new Node(30));
tree.insert(new Node(70));

// Search for a key
boolean exists = tree.search(30); // returns true

// Delete a node
tree.remove(30);

// Display sorted elements
tree.display();
```

---

## 👤 Author

Developed by **Syakira Agile Mumtaz** ([@Kirasukacoding](https://github.com/Kirasukacoding)).
