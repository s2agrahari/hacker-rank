package rank;

import java.util.Stack;

/**
 * created by @author suraj on 05/11/19
 */
public class SuperReducedString {

    public static void main(String[] args) {
        System.out.println(superReducedString("btba"));
    }

    static String superReducedString(String s) {

        Stack<Character> stack = new Stack<>();

        char[] cArr = s.toCharArray();

        stack.push(cArr[0]);

        int i = 1;

        while (i < cArr.length) {
            char c = cArr[i];
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                char top = stack.peek();
                if (c == top) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            ++i;
        }

        if (stack.isEmpty()){
            return "Empty String";
        }

        StringBuilder builder = new StringBuilder();

        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.reverse().toString();

    }
}
