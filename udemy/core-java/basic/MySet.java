import java.util.*;

class MySet{
    public static void main(String args[]){
        
        Set<Integer> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();
            if(num == -1) break;
            set.add(num);
        }

        // print
        for(int s : set) System.out.print(s + " ");

        sc.close();

    }
}