package CoreJava;/*
Important Case: Mutable Fields (Collections / Objects)
If your class contains mutable objects like:
List
Map
arrays
custom objects
You must use defensive copies.
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

final class Student {

    private final List<String> subs;

    public Student(List<String> subjects) {
        this.subs = new ArrayList<>(subjects);//defensive copy
        subs.set(0,"physics");

    }

    public List<String> getSubjects() {
        return new ArrayList<>(subs); // return copy
    }

}
public class ImmutableClass {
    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("english","math","hindi");
        Student obj = new Student(subjects);//1000
        System.out.println(obj.getSubjects());
        System.out.println(subjects);


    }
}

