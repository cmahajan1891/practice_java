import java.util.*;

class BracketMatching {
  boolean match(String s) {
    Map<Character, Character> map = new HashMap<>();
    Stack<Character> stk = new Stack<>();
    map.put('}','{');
    map.put(']','[');
    map.put(')','(');
    for (char c : s.toCharArray()) {

      if (map.containsValue(c)) {
        stk.push(c);
      }else {
        switch(c) {
          case '}' : if (map.get(c) != stk.pop()) {
            return false;
          }
          break;
          case ')' : if(map.get(c) != stk.pop()){
            return false;
          }
          break;
          case ']' : if (map.get(c) != stk.pop()) {
            return false;
          }
          break;
          default:
            break;
        }
      }
    }
    return stk.isEmpty();
  }

  public static void main(String[] args) {
    BracketMatching b = new BracketMatching();
    System.out.println(b.match("218736{]982[188]"));
  }
}
