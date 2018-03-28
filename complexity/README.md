# Computational Complexity

## Big O Notation
An asymptotic upper bound on the computational time of an algorithm, to within a constant factor.

* O(1) - constant time. Most common example of this is array access.
* O(logn) - logarithmic time, gets better as data set grows ("gets better" relative to size of data set)
* O(n) - linear time. Worst case is the size of the data set. Common example is accessing an element of a linked list, since in the worst case we need to traverse the entire list.
* O(nlogn) - example is a merge sort.
* O(n^2) - nested iterations over a data set, each iteration increases the power.
* O(2^n) - exponential time. Generally doesn't get much worse than this. An example is a recursive algorithm for calculating fibonacci numbers.

Key things when working out the Big O notation for an algorithm:
* First and foremost: how many times can an arbitrary member of the data set be touched by the algorithm? This will give you your starting point
* Drop the constants: Big O doesn't care if something could run n times, or 500n times - it's just O(n)
* Drop the less significant terms: O(n^3 + n^2) is just O(n^3).

# Space Complexity

## Big O Notation
An asymptotic upper bound on the memory cost of an algorithm. Pretty self-explanatory, though important to remember we're generally disregarding the space taken up by the initial inputs.




TODO: study up on big/little theta and omega.




#### Resources:
https://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/
http://bigocheatsheet.com
https://www.interviewcake.com/article/java/big-o-notation-time-and-space-complexity
Introduction to Algorithms (3rd Edition)
