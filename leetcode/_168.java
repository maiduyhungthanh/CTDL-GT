public class _168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder excel = new StringBuilder();
        while (columnNumber > 0){
            columnNumber --;
            char toAdd = (char)((columnNumber%26) + 65);
            excel.insert(0, toAdd);
            columnNumber/=26;
        }
        return excel.toString();
    }
    public static void main(String[] args) {
        int columnNumber = 999;
        int x = (25)%26;
        System.out.println(convertToTitle(columnNumber));
        System.out.println(x);
    }
}
