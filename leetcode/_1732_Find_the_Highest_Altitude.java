public class _1732_Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int[] input = new int[gain.length + 1];
        input[0] = 0;
        for (int i = 1; i < input.length; i++) {
            int temp ;
            temp = gain[i - 1] + input [i - 1];
            input[i] = temp;
        
       
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        _1732_Find_the_Highest_Altitude test = new _1732_Find_the_Highest_Altitude();
        System.out.println( test.largestAltitude(gain));
        
    }
}
