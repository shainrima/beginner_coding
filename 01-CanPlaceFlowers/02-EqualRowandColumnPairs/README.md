#Problem Description:
Arjun and Meera are working on a project that involves analyzing 2D grids. They want to find how many pairs (r_i, c_j) exist such that the ith row and jth column of the grid are exactly the same. A pair is considered equal if the elements in the row and the column match in the same order.

Input:

A square 2D integer array grid of size n x n.

Output:

An integer representing the total number of equal row-column pairs.

##Example:
Input: 
3
3 2 1
1 7 6
2 7 7

Output: 
1

##Explanation of the Code:
The code iterates through every row and every column in the grid and compares them element by element.

Outer loops iterate through all row (r) and column (c) indices.

For each pair (r, c), a boolean flag equal is set to true.

A nested loop compares each element in the rth row and cth column:

If any element doesn't match, equal is set to false and the loop breaks early.

If equal remains true, it means the entire row and column are the same, so the count is incremented.

Finally, the method returns the total count of equal pairs.
