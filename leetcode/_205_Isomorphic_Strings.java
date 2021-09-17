import java.util.HashMap;

import java.util.Map;


public class _205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
       Map<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length() ; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (map.containsValue(c2)) return false;
                map.put(c1, c2);
            }
        }
        //     for(Map.Entry<Character, Character> entry : myMap.entrySet()) {
        //     Character key = entry.getKey();
        //     Character value = entry.getValue();
        //     mySet.add(value);
        // }
        // if (myMap.size() != mySet.size()) {
        //     return false;
        // }
        return true;
    }
public static void main(String[] args) {
    String s = "adds";
    String t = "egga";
    System.out.println(isIsomorphic(s,t));
}
}
