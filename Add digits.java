class Solution {
    public int addDigits(int num) {
        if(num<=9){
            return num; 
        }
        int num2 = 0;
        while(num!=0){
            int u = num%10;
            num2+=u;
            num/=10;
        }
        return addDigits(num2);
    }
}
