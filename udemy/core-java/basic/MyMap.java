
import java.util.*;


class MyMap {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter numbers (type -1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        sc.close();
    }
}