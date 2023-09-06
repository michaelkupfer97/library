package library;

import java.util.Arrays;
import java.util.Objects;
/**
 * The Student class represents a student who can loan publications from a library.
 * Each student has a unique number, a name, and an array of loaned publications.
 */
public class Student {
    private String StudentName;
    private static int indexStud=0;
    private final int numStud;
    private int loanedNum;
    private Publication[] array ;
    /**
     * Creates a new Student object with the given name and initializes the loaned publication count to 0.
     * The student number is automatically assigned based on the order in which the object is created.
     * @param studentName the name of the student
     */
    public Student(String studentName){
        this.StudentName=studentName;
        this.loanedNum=0;
        this.array=new Publication[3];
        this. numStud=indexStud;
        indexStud++;
    }
    /**
     * Returns the name of the student.
     * @return the name of the student
     */
    public String getStudentName() {
        return StudentName;
    }
    /**
     * Sets the name of the student.
     * @param studentName the new name of the student
     */
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    /**
     * Returns the total number of students that have been created.
     * @return the total number of students
     */
    public static int getIndexStud() {
        return indexStud;
    }
    /**
     * Returns the unique number assigned to this student.
     * @return the student number
     */
    public int getNumStud() {
        return numStud;
    }
    /**
     * Returns the number of publications that this student has loaned.
     * @return the number of loaned publications
     */
    public int getLoanedNum() {
        return loanedNum;
    }
    /**
     * Sets the number of publications that this student has loaned.
     * @param loanedNum the new number of loaned publications
     */
    public void setLoanedNum(int loanedNum) {
        this.loanedNum = loanedNum;
    }
    /**
     * Returns an array of the publications that this student has loaned.
     * @return the array of loaned publications
     */
    public Publication[] getArray() {
        return array;
    }
    /**
     * Sets the array of publications that this student has loaned.
     * @param array the new array of loaned publications
     */
    public void setArray(Publication[] array) {
        this.array = array;
    }
    /**
     * Returns a string representation of the student object, including the student number, name, and number of loaned publications.
     * @return a string representation of the student object
     */
    @Override
    public String toString() {
        return "Student number:" +numStud+"\t"+
                "Name: " + StudentName +
                " loaned-publications: " +   loanedNum;
    }
    /**
     * Compares this student object to another object for equality.
     * Two student objects are considered equal if they have the same student number, name, and array of loaned publications.
     * @param o the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numStud == student.numStud && loanedNum == student.loanedNum && Objects.equals(StudentName, student.StudentName) && Arrays.equals(array, student.array);
    }

}
