class _13_{
        public static int romanToInt(String s) {
                int sum = 0;
                int total = 0;
        for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                switch (ch) {
                        case 'I':
                                if (i != s.length() - 1 && s.charAt(i + 1) == 'V'
                                                || i != s.length() - 1 && s.charAt(i + 1) == 'X') {
                                        sum = -1;
                                } else {
                                        sum = 1;
                                }
                                break;
                        case 'V':
                                sum = 5;
                                break;
                        case 'X':
                                if (i != s.length() - 1 && s.charAt(i + 1) == 'L'
                                                || i != s.length() - 1 && s.charAt(i + 1) == 'C') {
                                        sum = -10;
                                } else {
                                        sum = 10;
                                }
                                break;
                        case 'L':
                                sum = 50;
                                break;
                        case 'C':
                                if (i != s.length() - 1 && s.charAt(i + 1) == 'D'
                                                || i != s.length() - 1 && s.charAt(i + 1) == 'M') {
                                        sum = -100;
                                } else {
                                        sum = 100;
                                }
                                break;
                        case 'D':
                                sum = 500;
                                break;
                          case 'M':
                                sum = 1000;
                                break;       
                }
        
                total += sum;
        }
                return total;
        }
 public static void main(String[] args) {
        String s = "CM";
        System.out.println(romanToInt(s));
    }
}
