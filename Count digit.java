class Solution {
    public int countDigits(int num) {
        int n=num;
        int c=0;
        while(n!=0){
            int rem=n%10;
            if(num%rem==0){
                c+=1;
            }
            n/=10;
        }
        return c;
    }
}
