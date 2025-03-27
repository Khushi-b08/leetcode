class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        s=1
        e=x
        while(s<=e):
            mid=(s+e)//2
            if mid*mid==x:
                return mid
            elif mid*mid<x:
                s=mid+1
            else:
                e=mid-1
        return e
        