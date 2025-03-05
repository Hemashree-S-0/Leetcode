class Solution {
    public int countKeyChanges(String s) {
        String lw=s.toLowerCase();
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            if(lw.charAt(i)!=lw.charAt(i+1)){
                c+=1;
            }
        }
        return c;
    }
}
