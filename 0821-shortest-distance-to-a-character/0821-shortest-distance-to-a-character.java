class Solution {
    public int[] shortestToChar(String s, char c) {
       int n = s.length();
       int last =-n;
       int min=0;
    //    int minlen = 0;
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
        if(s.charAt(i)==c){
            last =i;
        }
        arr[i] = i-last;
       } 
       int next = 2*n;
       for(int i=n-1;i>=0;i--){
          if(s.charAt(i)==c){
            next = i;
          }
        //   min = next-i;
          arr[i] = Math.min(arr[i],next-i);
       }
       return arr;
    }
}