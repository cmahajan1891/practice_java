import java.util.*;

class ValidParentheses {
  boolean checkValid(String s) {
    if (s == null || s.length() == 0) {
      return false;
    }
    Stack<Character> stk = new Stack<>();
    // List<Character> list = new ArrayList<>();
    //
    // list.add(')');
    // list.add('}');
    // list.add(']');

    Map<Character, Character> map = new HashMap<>();
    map.put('(',')');
    map.put('{','}');
    map.put('[',']');

    char[] c = s.toCharArray();
    for (int i = 0 ; i < c.length ; i++) {
        if (map.containsKey(c[i])) {
          stk.push(c[i]);
        }else if(map.values().contains(c[i])){
          if (!stk.isEmpty() && c[i] == map.get(stk.peek())) {
            stk.pop();
          }else {
            return false;
          }
        }
    }
    return stk.isEmpty();
  }

  public static void main(String[] args) {
    ValidParentheses v = new ValidParentheses();
    System.out.print(v.checkValid(new String("{}}{}()")));
  }
}
