# Trees

## Binary Search Tree (BST)
Space complexity is O(n). Worst case complexity for all operations is O(n), and this occurs when the tree is as unbalanced as possible (and is effectively a linked list).

### Search
Average case complexity O(log n). Search is performed recursively on nodes.

### Insert
Average case complextity O(log n). Basically just perform a search, until you find the spot where the element you're inserting belongs.

### Delete
Average case complexity O(log n). Perform a search until we find the node for deletion. Then, three cases to consider:
* Node has no children: delete the node
* Node has one child: delete the node and replace it with its child
* Node has two children: replace node by minimum element in right subtree, then delete this duplicate node.


## Trie
A trie is an ordered tree data structure that is commonly used to store data sets of strings, such as a dictionary. Each node contains a character value, a map of child nodes, and a boolean. The idea is that we can build words by going down the tree - when we reach a node, the boolean value tells us if our traversal so far is resulting in a valid word. The map structure then maps to valid subsequent characters, and we can build on the word with these.

Determining the validity of a word can be done in O(n) time, when n is the size of the length of the key.

## Red Black Trees
A BST with an extra bit of information per node, a colour (either red or black). Through constraints on the node colours of any simple path from the root node to a leaf, we can ensure that no path is more than twice as long as the shortest path in the tree, and hence the tree is approximately balanced.

The properties of RB Trees which achieve this balance are:
* Every node is either red or black
* The root node is black
* Every leaf node (i.e. node without a value) is black
* The children of a red node are always black
* For each node, all simple paths from the node to descendent leaves contain the same number of black nodes.  

## Heap
A data structure that can be viewed as a nearly complete binary tree, with each node of the tree corresponding to an element of the array. Tree is filled on all levels except possiby the bottom, which is filled from the left. An array A representing a heap has two attributes:
* Length - the size of the array (and hence the capacity of the heap)
* Heap Size - the number of elements in the array which are part of the heap

The root of the tree is A[1], and the structure of the array means that given an index i of a node we can easily calculate the parent and children.
* PARENT = floor(i/2)
* LEFT = 2*i
* RIGHT = 2*i + 1

Two types of heaps: MIN and MAX. I'll discuss MAX heaps, but MIN heaps have all the same properties and operations, only inverted.

Operations on MAX heaps:
* MAX-HEAPIFY: runs in O(log n) time, is used to maintain the max-heap property
* BUILD-MAX-HEAP: runs in O(n) time, produces a max heap from an unordered input array
* HEAPSORT: runs in O(n log n) time, sort an array
* MAX-HEAP-INSERT, HEAP-EXTRACT-MAX, HEAP-INCREASE-KEY, HEAP-MAXIMUM: all run in O(log n) time, are used for priority queue implementation.

## Tree Traversal
There are a few strategies for traversing and displaying the contents of a tree data structure. They can be broadly described by two categories:

### Depth-first search
Recursive algorithms which explore the tree as deeply as possible for each sibling before continuing. There are three types that come under this category, and their output can be visualised by drawing an outline around the structure of the tree with dots that the outline travels through. Each type positions the dots differently, which affects when the line runs through them (and hence their order in the output).

#### Pre-order
Outputs node, then left tree, then right tree. Dots positioned on the left side of the node in visualisation.

#### In-order
Traverse left tree, display node, then traverse right tree. Dots positioned on bottom of node.

#### Post-order
Traverse left tree, traverse right tree, traverse node. Dots positioned on right side.

### Breadth-first search
Iterative algorithm that displays the contents of each level of the tree before continuing to the next. Implemented with a queue. 
