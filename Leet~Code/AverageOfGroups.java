class AverageOfGroups {
   void average(int []n, int g) {

     int avg[] = new int[n.length];
     int cnt = 0, sum = 0, i = 0;

     for (i = 0; i < n.length ; i++) {
       if (i < g) {
         sum = sum + n[i];
       }else {

         if (i == g) {
             avg[cnt] = sum / g;
         }else if (i > g) {
           avg[cnt] = avg[cnt-1] + (n[i]-n[i-g])/g;
         }
         cnt++;
       }
     }
     avg[cnt] = avg[cnt-1] + (n[i-1]-n[i-g-1])/g;
     for (int k = 0; k <= cnt; k++) {

       System.out.println(avg[k]);

     }
  }

  public static void main(String[] args) {
    AverageOfGroups av = new AverageOfGroups();
    av.average(new int[] {6,6,6,12,12,12}, 3);
  }
}
