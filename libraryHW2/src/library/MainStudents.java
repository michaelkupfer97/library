package library;


import static library.Student.getIndexStud;

public class MainStudents {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        students[0]=new Student("Albert Einstein");
        students[1]= new Student("Marie Curie");
        students[2]= new Student("Rosalind Franklin");
        students[3]= new Student("Stephen Hawking");
        listStudents(students);
    }

    public static void listStudents(Student [] arr){
        for (int i =0; i< getIndexStud();i++){
            System.out.println(arr[i]);
        }
    }


}
