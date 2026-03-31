import java.lang.*;
import java.util.*;

class keyboard{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name :  ");
        String name;
        
        name = s.nextLine();
        System.out.println("Welcome, " + name);

    }
}