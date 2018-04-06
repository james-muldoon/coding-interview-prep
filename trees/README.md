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

## Heap
