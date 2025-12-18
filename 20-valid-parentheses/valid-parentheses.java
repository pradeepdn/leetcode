class Solution {
    public boolean isValid(String s) {
        Deque<Character> open = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                open.push(c);
            }
            if (c == ')') {
                if (open.isEmpty() || open.pop() != '(') {
                    return false;
                }
            }
            if (c == ']') {
                if (open.isEmpty() || open.pop() != '[') {
                    return false;
                }
            }
            if (c == '}') {
                if (open.isEmpty() || open.pop() != '{') {
                    return false;
                }
            }
        }
        if (!open.isEmpty()) {
            return false;
        }

        return true;

    }
}