import java.io.*;

class test {
  public static void main(String[] args) throws IOException  {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;


    while ((s = in.readLine()) != null) {
    String m[] = s.split("\\|");
    for (String j : m) {
      System.out.println(j);
    }



  }

  }
}
