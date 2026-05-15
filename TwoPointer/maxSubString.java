package TwoPointer;

import java.util.Arrays;

public class maxSubString {
    public int longestNonRepeatingSubstring(String s) {
      int[] hash = new int[256];
      Arrays.fill(hash, -1);
      String sub="";
       int l=0; int r=0; int max=0; int cur=0;
       while(r< s.length()){
        if(hash[s.charAt(r)]!=-1){
            if(hash[s.charAt(r)]>=l){
                l= hash[s.charAt(r)]+1;
            }
            cur= r-l+1;
            max= Math.max(max, cur);
            hash[s.charAt(r)]=r;
            r++;
        }
       }
       return max;
    }

    
}
