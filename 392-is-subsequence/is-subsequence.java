class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;  // pointer for s
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++; // move to next char in s
            }
        }
        return j == s.length();
    }
}
