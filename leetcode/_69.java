public class _69 {
    public static int mySqrt(int x) {
        double y = (double) x;
        double z = Math.sqrt(y);
        String w = String.valueOf(z);
        int canBacHai = 0;
        String khaiCan = "";
        
          int q = w.indexOf(".");  
            khaiCan = w.substring(0, q); 
            canBacHai = Integer.parseInt(khaiCan);
       
      
        return canBacHai;
    }
    public static void main(String[] args) {
       int x = 10;
       
       System.out.println(mySqrt(x));
    }
}
