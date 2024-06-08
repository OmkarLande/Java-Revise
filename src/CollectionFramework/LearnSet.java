package CollectionFramework;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();

        set.add(23);
        set.add(45);
        set.add(67);
        set.add(89);
        set.add(23);
        set.add(45);
        System.out.println(set);
        set.remove(45);
        System.out.println(set);
        System.out.println(set.contains(67));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();

        Set <Integer> set1 = new LinkedHashSet<>();

        set1.add(23);
        set1.add(45);
        set1.add(67);
        set1.add(89);
        set1.add(23);
        set1.add(45);

        System.out.println(set1);
        set1.remove(45);
        System.out.println(set1);
        System.out.println(set1.contains(67));
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        set1.clear();

        Set <Integer> set2 = new TreeSet<>();

        set2.add(23);
        set2.add(45);
        set2.add(67);
        set2.add(89);
        set2.add(23);

        System.out.println(set2);
        set2.remove(45);
        System.out.println(set2);
        System.out.println(set2.contains(67));
        System.out.println(set2.isEmpty());
        System.out.println(set2.size());
        set2.clear();

        // Custom class set
        Set <Student> studentSet = new HashSet<>();
        studentSet.add(new Student("John", 101));
        studentSet.add(new Student("Mike", 102));
        studentSet.add(new Student("David", 103));
        studentSet.add(new Student("John", 101));

//        for(Student student: studentSet){
//            System.out.println(student.name+" "+student.rollNo);
//        }

        System.out.println(studentSet);


    }
}
