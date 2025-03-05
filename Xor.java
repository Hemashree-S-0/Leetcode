class Solution {
    public int xorOperation(int n, int start) {
        int bit=0;
        for(int i=0;i<n;i++){
            int n1=start+2*i;
            bit^=n1;
        }
        return bit;
    }
}
