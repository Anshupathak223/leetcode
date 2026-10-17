class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=  stones.length();
        int m = jewels.length();
        int count=0;
        char[] arr = jewels.toCharArray();
        for(int i=0;i<n;i++){
        for(char ch : arr ){
            if(stones.charAt(i)==ch){
                count++;
                break;
            }
        }
        }
       return count; 
    }
}