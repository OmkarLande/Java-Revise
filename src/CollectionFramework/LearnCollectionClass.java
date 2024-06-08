package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("min value: " + Collections.min(numbers));
        System.out.println("max value: " + Collections.max(numbers));
        System.out.println("frequency of 2: " + Collections.frequency(numbers, 2));

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("Reverse Sorted List: " + numbers);

        //for custom class

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(new Student("Mike", 22));
        students.add(new Student("Andrew", 30));
        students.add(new Student("Johnny", 22));

        Student student = new Student("pohn", 2135);
        Student student1 = new Student("mohn", 2512);
        System.out.println(students);

        Collections.sort(students);
        System.out.println("sortedList"+students);

        Collections.sort(students, Comparator.reverseOrder());
        System.out.println("reverseSortedList"+students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("sortedListByName"+students);

        //using lambda expression
        Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("sortedListByName"+students);
    }
}
