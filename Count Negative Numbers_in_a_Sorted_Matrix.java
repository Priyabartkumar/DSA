Topic:Binary Search 
question n.o =1351
Level = Easy

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100

 
 ANSWER:
 class Solution {
    public int countNegatives(int[][] grid) {
        int rows= grid.length;
        int cols = grid[0].length;
        int i=0, j=cols-1;
        int count = 0;

        while(i<rows && j>=0){
            if(grid[i][j]<0){
                count += (rows-i);
                j--;
            }else{
                i++;
            }
        }
         return count;
    }
}
 
