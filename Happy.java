class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int sum=0;
        while(true){
            while(n!=0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            if(sum==1 | sum==7){
                return true;
            }
            else if(sum<=9){
                return false;
            }
            else{
                n=sum;
                sum=0;
            }
        }
    }
}
