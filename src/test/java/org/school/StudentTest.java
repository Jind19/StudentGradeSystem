package org.school;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {

    private List<Student> studentList;

    @BeforeEach
    void setUp(){
        studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 3.8));
        studentList.add(new Student("Charlie", 3.9));
        studentList.add(new Student("Bob", 3.5));
    }

    @Test
    @DisplayName("Students should sort by GPA descending")
    void testSortByGpa(){
        Collections.sort(studentList);
        assertEquals("Charlie", studentList.get(0).getName());
        assertEquals("Alice", studentList.get(1).getName());
        assertEquals("Bob", studentList.get(2).getName());

    }


    @Test
    @DisplayName("Students should sort by name alphabetically")
    void testSortByName(){
        studentList.sort(new StudentNameComparator());
        assertEquals("Alice", studentList.get(0).getName());
        assertEquals("Bob", studentList.get(1).getName());
        assertEquals("Charlie", studentList.get(2).getName());
    }

}
