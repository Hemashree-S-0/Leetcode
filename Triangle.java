class Solution {
    public String triangleType(int[] nums) {
        int c=0;
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
            if(nums[i]==nums[j]){
                c+=1;
            }
        }
        }
        if((c==3)&&((nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]))){
            return "equilateral";
        }
        else if((c>=1)&&((nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]))){
            return "isosceles";
        }
        else{
            if(nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            return "scalene";
            }
            else{
                return "none";
            }
        }
    }
}
