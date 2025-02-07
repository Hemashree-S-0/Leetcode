class Solution {
    public int romanToInt(String s) {
        char[] a=s.toCharArray();
        int l=a.length;
        int[] n=new int[l];
        for(int i=0;i<l;i++){
            if(a[i]=='I'){
                n[i]=1;
            }
            else if(a[i]=='V'){
                n[i]=5;
            }
            else if(a[i]=='X'){
                n[i]=10;
            }
            else if(a[i]=='L'){
                n[i]=50;
            }
            else if(a[i]=='C'){
                n[i]=100;
            }
            else if(a[i]=='D'){
                n[i]=500;
            }
            else if(a[i]=='M'){
                n[i]=1000;
            }
        }
        int sum=0;
        for(int j=l-1;j>=0;j--){
            if((j!=0) && (n[j]>n[j-1])){
                n[j]=n[j]-n[j-1];
                n[j-1]=0;
            }
        }
        for(int k=0;k<l;k++){
            sum+=n[k];
        }
       return sum; 
    }
}
