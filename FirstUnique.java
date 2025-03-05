class Solution {
    public int firstUniqChar(String s) {
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
