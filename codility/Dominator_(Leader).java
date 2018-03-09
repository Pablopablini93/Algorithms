import java.util.HashMap;

public class Dominator {

    public int solution(int A[]) {
        HashMap<Integer, Integer> slow = new HashMap();
        for (int key : A) {
            if (!slow.containsKey(key)) {
                slow.put(key, 0);
            }
            slow.put(key, slow.get(key) + 1);
        }

        for (int i = 0; i < A.length; i++) {
            if (slow.get(A[i]) > A.length / 2)
                return i;
        }
        return -1;
    }
}