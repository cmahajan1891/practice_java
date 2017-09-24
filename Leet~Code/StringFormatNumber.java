import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

class StringFormatNumber {

  //Format String as a Number using NumberFormat.getNumberInstance() Method.
  void formatNumber (int num) {
    NumberFormat n = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    String s = n.format(num);
    System.out.println(s);
  }

  //format number using the String.format Method.
  void formatNum(int num){
    String s = String.format("%,d", num);
    System.out.println(s);
  }

  //format the number using the Decimal format
  void formatNums(int num){
    DecimalFormat d = new DecimalFormat("#,###");
    System.out.println(d.format(num));
  }

  void myFunction(int num){
    StringBuilder sb = new StringBuilder();
    int d = 10, r = 0, count = 0;

    while (num > 0) {
      if (count!=0 && count%3 == 0) {
        sb.append(",");
      }
      int tmp = num%10;
      sb.append(tmp);

      num = num/10;
      count++;
    }

    System.out.println(sb.reverse().toString());
  }
  String indianFormat(double n) {

     // Formats a number in the <span class="searchlite">Indian</span> style
      String returnValue;

      DecimalFormat formatter = new DecimalFormat("#,###.00");


      // we never reach double digit grouping so return

      if(n < 100000) return formatter.format(n);


      // switch to double digit grouping

      formatter.applyPattern("#,##");


      //divide by 1000, so that we get everything before the 3-group

      returnValue = formatter.format((int)(n / 1000)) + ",";


      // switch back to triple grouping + decimal

      formatter.applyPattern("#,###.00");


      // remove value of number over 999 (so we just get the last

      // 5 digits)

      returnValue += formatter.format(n - (int)(n / 1000) * 1000);


      return returnValue;

    }




  public static void main(String[] args) {
    StringFormatNumber s = new StringFormatNumber();
    s.formatNumber(912345);
    s.formatNum(1234567);
    s.formatNums(1234567);
    s.myFunction(1234567);
    System.out.println(s.indianFormat(1234567));
  }
}
