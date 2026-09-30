class Solution {
    public int maxNumberOfBalloons(String text) {
     int len = text.length();
     int[] freq = new int[26];
     for(int i=0;i<len;i++){
        char ch = text.charAt(i);
        int index = ch-'a';
        freq[index]++;
     } 
    int b = freq['b' - 'a'];   
    int a = freq['a' - 'a'];   
    int l = freq['l' - 'a']/2;
    int o = freq['o' - 'a']/2;
    int n = freq['n' - 'a']; 

    return Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);   


    }
}