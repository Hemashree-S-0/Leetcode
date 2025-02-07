class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int res=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return l;
    }
}
