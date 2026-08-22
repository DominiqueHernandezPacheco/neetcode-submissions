class Solution {
    public int evalRPN(String[] tokens) {
        int eval;

        Deque<Integer> calc = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("*") && !tokens[i].equals("/") && !tokens[i].equals("-")) {
                calc.push(Integer.parseInt(tokens[i]));
            } else {
                int num2 = calc.pop();
                int num1 = calc.pop();
                if (tokens[i].equals("+")) {
                    calc.push(num1 + num2);
                    continue;
                }
                if (tokens[i].equals("-")) {
                    calc.push(num1 - num2);
                    continue;
                }
                if (tokens[i].equals("/")) {
                    calc.push(num1 / num2);
                    continue;
                }
                if (tokens[i].equals("*")) {
                    calc.push(num1 * num2);

                    continue;
                }
            }
        }
        return calc.peek();
    }
}
