class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            while (window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            maxLength = Math.max(maxLength, window.size());
        }
    return maxLength;
    }
}