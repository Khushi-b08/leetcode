# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        s=1
        e=n
        while(s<=e):
            mid=s+(e-s)//2
            if isBadVersion(mid):
                e=mid-1
            else:
                s=mid+1
        return s