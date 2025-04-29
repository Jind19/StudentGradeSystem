package org.school;

/**
 *  Student class that implements Comparable to sort naturally  by GPA(high to low)
 */

public class Student implements Comparable<Student>{

    //Fields
    private final String name;
    private final double gpa;  //Grade Point Average

    // Constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    /**
     *
     * Natural ordering: sort by GPA descending(high to low)
     * @param otherStudent : other Student comparing with
     * @return int :
     * < 0 : this object is less than other (comes first when sorting)
     *  0 : this object is equal to other
     * >0 : this object is greater than other(comes after when sorting)
     *
     */
    @Override
    public int compareTo(Student otherStudent){

//          Here notice carefully: otherStudent.gpa comes first, this.gpa comes second.
//          That means:
//          otherStudent.gpa > this.gpa : Return -1 -> otherStudent comes before this
//          otherStudent.gpa == this.gpa : Return 0
//          otherStudent.gpa < this.gpa : Return 1 -> otherStudent comes after this

        return Double.compare(otherStudent.gpa, this.gpa);
    }

    @Override
    public String toString(){
        return name + " (GPA: " + gpa + ")";
    }
}
