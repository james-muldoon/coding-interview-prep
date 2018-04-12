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

## Graph colouring
The graph colouring problem is NP-hard, which is to say there is no known polynomial-time algorithm for solving it. The idea of the problem is that you have a graph consisting of vertices, and edges between these vertices. Given an integer k, we need to determine whether the graph can be "coloured" in such a way that no adjacent vertices are coloured the same, and at most k colours are used.

The applications of this problem include:
* Map colouring: where countries/states are the vertices, and sharing a border is considered an "edge"
* Solving Sudoku
* Scheduling  

### Backtracking Algorithm
A solution for the problem is to apply a recursive "backtracking algorithm". The algorithm consists of two main components:
* graphColour(graph, k, colours, nodesColoured): the recursive function. After checking to see whether the algorithm is finished (with nodesColoured), the algorithm iterates through the available colours and assigns the first colour which doesn't break the condition (using helper function isSafe). The algorithm then calls itself. If the result of the recursive call is false, then we know the assignment of that colour didn't result in a working solution, so we try assigning a different colour. The algorithm fails when all colour options have been exhausted from the first node examined.
* isSafe(vertex, graph, colours, colour): examines adjacent vertices and returns true if none of the nodes are coloured "colour".

## Dijkstra's Algorithm
This algorithm is used to solve the single-source shortest path problem on a weighted directed graph (assumes non-negativity of weights).
// TODO expand on this when I can be bothered.

## A*
A variation of Dijkstra's algorithm which uses an additional heuristic function to reduce the number of paths explored.
// TODO expand on this when I can be bothered.
