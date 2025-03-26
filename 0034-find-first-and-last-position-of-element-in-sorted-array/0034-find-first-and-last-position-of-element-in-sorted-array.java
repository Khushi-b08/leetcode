class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length - 1;
        int mid,fpos=-1,lpos=-1;
        int[] result = new int[2];
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                fpos=mid;
                e=mid-1;
            }
        }
        s=0;
        e=nums.length-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                lpos=mid;
                s=mid+1;
            }
        }

        result[0]=fpos;
        result[1]=lpos;
        return result;
    }
}
