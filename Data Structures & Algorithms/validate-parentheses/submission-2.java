class Solution {
    public boolean isValid(String s) {
        Deque<Character> bracket = new ArrayDeque<>();
        HashMap<Character, Character> br = new HashMap<>();

        br.put('(', ')');
        br.put('{', '}');
        br.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' ||s.charAt(i) == '[' ||s.charAt(i) == '(') {
                bracket.push(s.charAt(i));

            } else {
                if (bracket.isEmpty() || s.charAt(i) != br.get(bracket.pop())) {
                    return false;
                }
            }
        }
        return bracket.isEmpty();
    }
}
