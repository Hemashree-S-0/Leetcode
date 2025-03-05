class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
            es=es+nums[i];
            int n=nums[i];
            while(n!=0){
                int rem=n%10;
                ds+=rem;
                n=n/10;
            }
        }
        return es-ds;
    }
}
