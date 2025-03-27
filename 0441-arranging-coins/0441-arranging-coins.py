class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        c=0
        i=1
        while n>=i:
            n-=i
            c+=1
            i+=1
        return c
            
        