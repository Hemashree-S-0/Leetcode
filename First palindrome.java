class Solution {
    public String firstPalindrome(String[] words) {
        int l=words.length;
        for(int i=0;i<l;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String s1){
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        return s2.equals(s1);
    }
}
