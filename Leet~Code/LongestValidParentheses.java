import java.util.*;

class LongestValidParentheses {
  int longestValid(String s) {
    int result = 0;
    if (s == null || s.length() == 0) {
      return 0;
    }

    Stack<int []> st = new Stack<>();

    for (int i = 0 ; i < s.length() ; i++) {
      char c = s.charAt(i);
      if (c == '(') {
        int [] tmp = new int[]{i,0};
        st.push(tmp);
      }else {
        if (st.isEmpty() || st.peek()[1] == 1) {
          int [] a = {i, 1};
          st.push(a);
        }else {
          st.pop();
          int currentLength = 0;
          if (st.isEmpty()) {
            currentLength = i + 1;
          }else {
            currentLength = i - st.peek()[0];
          }
          result = Math.max(result, currentLength);
        }
      }
    }
return result;
  }

  public static void main(String[] args) {
    LongestValidParentheses l = new LongestValidParentheses();
    System.out.print(l.longestValid("()()))()"));
  }
}
