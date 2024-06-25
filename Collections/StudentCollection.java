package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCollection {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(6, "Krishna", "BSC"));
        list.add(new Student(7, "Nagaraj", "Bcom"));
        list.add(new Student(16, "Sai krishna", "Btech"));
        list.add(new Student(38, "Rajesh", "BE"));

        Student s = new Student(142, "Firoz", "BCA");
        list.add(s);

        // Sort the list based on student names
        //Collections.sort(list, Comparator.comparingDouble(Student::getName));

        for (Student s1 : list) {
            System.out.println(s1);
        }
    }
}
