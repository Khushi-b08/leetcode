class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        m=len(grid)
        n=len(grid[0])
        row=0
        col=n-1
        c=0
        while row<m and col>=0:
            if grid[row][col]<0:
                c+=m-row
                col-=1
            else:
                row+=1
        return c