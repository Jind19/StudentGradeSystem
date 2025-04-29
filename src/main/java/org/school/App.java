package org.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Student App class used for Simulation
 */

public class App 
{
    public static void main( String[] args ) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.8));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("Bob", 3.5));

        System.out.println("Original List: ");
//        for(Student student : students){
//            System.out.println(student);
//        }


        students.forEach(System.out::println);
        // Iterate over the list of students and print each student's details using method reference
        //students.forEach(...): Loops through each element in the students list.
        //System.out::println: A method reference that tells Java to
        // call System.out.println(student) for each student in the list.

//        int result = students.get(0).compareTo(students.get(1));
//        System.out.println(result);
//
//        Collections.sort(students);
//        System.out.println("\nSorted byGPA(High to Low): ");
//        students.forEach(System.out::println);


        //sort by name
        System.out.println("\nAlphabetically sorted list");
        students.sort(new StudentNameComparator());

        // Print sorted list
        students.forEach(System.out::println);
    }
}
