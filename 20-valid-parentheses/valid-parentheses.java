class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                open.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (open.empty() || open.pop() != '(') {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (open.empty() || open.pop() != '[') {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (open.empty() || open.pop() != '{') {
                    return false;
                }
            }
        }
        if (!open.empty()) {
            return false;
        }

        return true;

    }
}