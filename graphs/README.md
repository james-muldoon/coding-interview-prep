# Graphs

## Graph Representations
Graph G = (V,E), where V is the vertices of the graph and E is the set of edges.

Two standard ways to represent a graph:
* As a collection of adjacency lists: provides a compact way to represent sparse graphs (graphs where |E| is much less than |V|^2). Generally the preferred method.
* An adjacency matrix: preferred when the graph is dense, or when we need to be able to quickly tell if there is an edge between two given vertices.

### Adjacency Lists
Graph is represented as an array Adj of V lists (one list per graph vertex). Each list Adj[u] consists of the vertices adjacent to vertex u. Space complexity is Big Theta (V + E).

### Adjacency Matrix
Assume that vertices are numbered 1, 2, ..., |V|. The graph is then stored as a |V| * |V| matrix with the value stored in each position indicating whether an edge exists between the two vertices.

## Graph Traversal

### Breadth-first search
Given a graph G = (V, E) and a source vertex s, a BFS "discovers" all vertices reachable from s, the shortest distance to each vertex, and produces a "breadth first" tree with root s that contains all reachable vertices.

The search discovers vertices in order of their distance from the root vertex. That is, all vertices at distance k from s are discovered before any at distance k + 1. Progress is tracked by "colouring" nodes. All nodes are initially coloured white, and becomes nonwhite when it is initially discovered. If a vertex is black then it and all it's neighbours have been discovered (i.e. it has no white neighbours). Gray vertices may have white neighbours - they represent the frontier between discovered and undiscovered.

### Depth-first search
Discovers all vertices reachable from s by fully exploring each vertex before moving on. Uses same colouring method as BFS, and also records two timestamps - one for when the vertex is initially discovered (made grey), and one for when the search finishes examining it's adjacency list (made black). These timestamps give important information about the structure of the graph.
