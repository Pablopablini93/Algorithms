import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static class Queue<T> {
        private Stack<T> s1 = new Stack<>();
        private Stack<T> s2 = new Stack<>();

        public void enque(T item) {
            s1.push(item);
        }

        public void deque() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            s2.pop();
        }

        public T front() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue<Integer>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();
            if (operation == 1)
                queue.enque(sc.nextInt());
            if (operation == 2)
                queue.deque();
            if (operation == 3)
                System.out.println(queue.front());
        }

    }
}