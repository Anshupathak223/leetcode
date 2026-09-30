class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int[] hash = new int[256];
       Arrays.fill(hash,-1);
       int l=0;
       int r =0;
       int maxlen=0;
       while(r<n){
         char ch = s.charAt(r);
        if(hash[ch]!=-1){
            if(hash[ch]>=l){
                l = hash[ch]+1;
            }
        }
        int len = r-l+1;
        maxlen = Math.max(maxlen,len);
        hash[ch] = r;
        r++;
       } 
       return maxlen;
    }
}