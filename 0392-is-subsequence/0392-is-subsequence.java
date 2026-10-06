class Solution {
    public boolean isSubsequence(String s, String t) {
      int n = s.length();
      int m = t.length();
      int i=0;
      int j=0;
      int count=0;
      while(i<n && j<m){
        char ch = s.charAt(i);
        char st = t.charAt(j);
        if(ch==st){
            i++;
            j++;
            count++;
        }
        else{
            j++;
        }
      }
      if(count==n){
        return true;
      }  
      else{
        return false;
      }
    }
}