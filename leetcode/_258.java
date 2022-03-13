public class _258 {
    public static int addDigits(int num) {
        int kQ = num;
        while (kQ > 10){
            kQ = deQuy(kQ);
        }
        return kQ;
    }
    public static int deQuy (int num ){
        String St = String.valueOf(num);
        int n = 0;
        for (int i = 0; i < St.length(); i++) {
            int x = Character.getNumericValue(St.charAt(i));
            n += x;
        }
        return n; 
    }
    public static void main(String[] args) {
        int num = 1;
        System.out.println(addDigits(num));
    }
}
