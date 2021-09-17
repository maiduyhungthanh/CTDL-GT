import java.util.HashSet;
import java.util.Set;

public class _1346_Check_If_N_and_Its_Double_Exist {
    public static boolean checkIfExist(int[] a) {
        int count = 0;
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            } else {
                mySet.add(a[i]);
                if (mySet.contains(a[i] * 2) || a[i] % 2 == 0 && mySet.contains(a[i] / 2)) {
                    return true;
                }
            }
        }
        if (count > 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] a = {1,3,5,0,7};
        System.out.println(checkIfExist(a));
    }
}
