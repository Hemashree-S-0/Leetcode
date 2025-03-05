class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        Set<Character> s =  new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            char g = sentence.charAt(i);
            if(g >= 'a' && g <= 'z')
            {
                s.add(g);
            }
        }
        return s.size() == 26;
    }
}
