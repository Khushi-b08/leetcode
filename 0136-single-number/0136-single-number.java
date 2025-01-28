class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        //XOR all the numbers present in the array
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        // return the result 
        return xor;
    }
}