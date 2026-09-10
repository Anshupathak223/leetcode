class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int n = columnNumber;
        while(n>0){
            n--;
            int curr = n%26;
            n/=26;
            sb.append((char)(curr+'A'));
        }
        return sb.reverse().toString();
    }
}