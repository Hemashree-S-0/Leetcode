class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int[] n=new int[l];
        for(int i=0;i<l;i++){
            if(i%2==0){
                n[i]=nums[i+1];
            }
            else{
                n[i]=nums[i-1];
            }
        }
        return n;
    }
}
