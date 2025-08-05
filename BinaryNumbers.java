import java.util.*;

public class BinaryNumbers {
    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 1; i <= n; i++) {
            String current = queue.poll();
            System.out.println(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int n = 15;
        generateBinary(n);
    }
}
