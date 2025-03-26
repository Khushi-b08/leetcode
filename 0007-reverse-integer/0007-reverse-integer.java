class Solution {
    public int reverse(int x) {
        int n=x,s=0,r;
        n=Math.abs(n);
        while(n>0){
            r=n%10;
            n/=10;
            if(s>Integer.MAX_VALUE/10||(s==Integer.MAX_VALUE/10&&r>7))
                return 0;
            s=s*10+r;
        }
        if(x<0)
            s=s*-1;
        return s;
    }
}