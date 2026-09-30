class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int l =0;int r=0; int fort=0; int maxfort =0;
        while(r<n){
            if(forts[r]!=0){

                if(forts[l] != 0 && forts[l]!=forts[r]){
                    int len = r-l-1;
                    maxfort=Math.max(maxfort,len);
                }
                l=r;
            }
            r++;
        }
        return maxfort;
    }
}