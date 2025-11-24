class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String cleaned = sb.toString();

        int left = 0;
        int right = cleaned.length()-1;

        while(left<right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
    return true;
    }
}