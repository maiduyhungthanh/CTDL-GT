import java.util.LinkedList;
import java.util.Queue;

//933. Number of Recent Calls

public class _933_Number_of_RecentCalls {

    Queue<Integer> listRequests = new LinkedList<>();;

    public _933_Number_of_RecentCalls() {
    }

    public int ping(int t) {
        listRequests.add(t);

        while (!listRequests.isEmpty() && listRequests.peek() < (t - 3000)) {
            listRequests.remove();
        }

        return listRequests.size();
    }

    public static void main(String[] args) {
        _933_Number_of_RecentCalls obj = new _933_Number_of_RecentCalls();
        int param_1 = obj.ping(1);
        int param_2 = obj.ping(100);
        int param_3 = obj.ping(3000);
        int param_4 = obj.ping(3003);

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}