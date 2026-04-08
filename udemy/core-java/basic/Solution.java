
import java.util.*;

class Person {

    private String name;
    private int age;
    private String dept;

    public Person(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }
}

class Solution {

    public static List<Person> filterPersons(Person[] persons, int age_filter) {
        List<Person> res = new ArrayList<>();

        for (Person person : persons) {
            if (person.getAge() == age_filter) {
                res.add(person);
            }
        }

        return res;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. : ");
        int n = Integer.parseInt(sc.nextLine().trim());

        // Input
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            persons[i] = new Person(
                    sc.nextLine().trim(),
                    Integer.parseInt(sc.nextLine().trim()),
                    sc.nextLine().trim()
            );
        }

        // function call
        int age_filter = Integer.parseInt(sc.nextLine().trim());
        List<Person> res = filterPersons(persons, age_filter);

        // output
        if (res == null) {
            System.out.println("No Person Found");
        } else {
            for (Person p : res) {
                System.out.println(
                        p.getName() + "\n"
                        + p.getAge() + "\n"
                        + p.getDept()
                );
                System.out.println();;
            }
        }

    }
}
