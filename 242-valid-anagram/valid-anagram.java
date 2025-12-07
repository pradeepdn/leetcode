class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }
}
/* Using HashMap */
// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if (s.length() != t.length()) {
//             return false;
//         }
//         Map<Character, Integer> mag = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             mag.put(c, mag.getOrDefault(c, 0) + 1);
//         }

//         for (int i = 0; i < t.length(); i++) {
//             char c = t.charAt(i);
//             if (!mag.containsKey(c) || mag.get(c) == 0) {
//                 return false;
//             }
//             mag.put(c, mag.get(c) - 1);
//         }
//         return true;

//     }
// }