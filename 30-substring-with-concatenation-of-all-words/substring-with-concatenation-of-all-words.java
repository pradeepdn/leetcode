class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int L = words[0].length();
        int windowSize = L * words.length;

        int left = 0;

        Map<String, Integer> freq = new HashMap<>();
        Map<String, Integer> currFreq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            freq.put(words[i], freq.getOrDefault(words[i], 0) + 1);
        }

        for (int i = 0; i < L; i++) {
            left = i;
            currFreq.clear();

            for (int right = i; right < s.length(); right += L) {
                if (right + L > s.length()) break;
                String word = s.substring(right, right + L);

                if (!freq.containsKey(word)) {
                    currFreq.clear();
                    left = right + L;
                    continue;
                }

                currFreq.put(word, currFreq.getOrDefault(word, 0) + 1);

                while (currFreq.get(word) > freq.get(word)) {
                    String leftWord = s.substring(left, left + L);
                    currFreq.put(leftWord, currFreq.get(leftWord) - 1);
                    left += L;
                }

                if (right - left + L == windowSize) {
                    result.add(left);
                }
            }
        }
        return result;
    }
}