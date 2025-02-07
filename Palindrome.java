class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int x1=x;
            int mul=0;
            while(x1!=0){
            int rem=x1%10;
            mul=(mul*10)+rem;
            x1/=10;
            }
            if(x==mul){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
