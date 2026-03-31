import java.lang.*;
import java.util.*;

class keyboard{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a, b, c;
        a =s.nextInt();
        b =s.nextInt();
        c = a+b;

        System.out.println("Sum ==> " + c);

    }
}