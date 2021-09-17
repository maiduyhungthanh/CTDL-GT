public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        // if (strs.length ==1) {
        //     return strs[0];
        // }
        // for (int i = 0; i < strs.length; i++) {
        //     if (strs[i].length() == 0) {
        //         return "";
        //     }
        // }
        if(strs == null || strs.length == 0) {
            return "";
        }
        for (int j = 0; j < strs[0].length(); j++) {
            sb.append(strs[0].charAt(j));
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].startsWith(sb.toString()) == false) {
                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
     
    }
}
