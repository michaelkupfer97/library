package library;

import java.util.Scanner;

import static library.MainPublication2.sort;
import static library.Publication.getIndexOfPub;
import static library.Student.getIndexStud;

public class MainLibrary {
    public static void main(String[] args) {

        /**
         * makes arrays from ex1
         */
        Publication[] publications = new Publication[100];
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee", "harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
        authors[2] = new Author("Amos Oz", "oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");

        publications[0] = new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.",
                2, authors[0], "Tay Hohoff", 1960);
        publications[1] = new Article("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 0, 297, 2020,
                "Yanshuf Aezim", authors[5],
                "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[2] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[3] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1);
        publications[4] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 102, 2021,
                "Alufot Eropa le-Mathematica", authors[4],
                "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[5] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3);
        publications[6] = new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1], "Maxwell Perkins", 1925);
        publications[7] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
        publications[8] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[9] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2], "", 2002);
        publications[10] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 106, 2022,
                "AI (artificial intelligence) is upgrading", authors[3],
                "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[11] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2);
        publications[12] = new Journal("Nature", "Springer Nature",
                5, 590, 2021);

        /**
         * makes array ex2
         */
        Student[] students = new Student[100];
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");

        /**
         * start ex2 c
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the library. Start loan:");
        System.out.println("Insert student number [0," + getIndexStud() + "]");
        int scanStud = scanner.nextInt();
        while (scanStud != (-1)) {
            System.out.println("Insert publication number [10," + getIndexOfPub() + "]");
            int scanPub = scanner.nextInt();
            scanPub=scanPub-10;
            //if there is enough pub and the student do not have already 3 pub loan, he can loan.
            if (publications[scanPub].getQty() > 0 && students[scanStud].getLoanedNum() < 3) {
                //put in his array the pub.
                (students[scanStud].getArray())[students[scanStud].getLoanedNum()] = publications[scanPub];
                //set ++ to his loaned num.
                students[scanStud].setLoanedNum(students[scanStud].getLoanedNum() + 1);
                //set -- to pub qty in library.
                publications[scanPub].setQty(publications[scanPub].getQty() - 1);
                //print the student details and all his books in loan.
                System.out.println("Loan Report");
                System.out.println(students[scanStud]);
                print(students[scanStud].getArray());
                System.out.println("Successful loan of:");
                System.out.println(publications[scanPub].getNumOfPub()+ " - "
                                +"\t"+"qty:"+publications[scanPub].getQty()
                                +"\'"+publications[scanPub].getTitle()+"\'");
            }//if the pub is out of qty.
            else if (publications[scanPub].getQty() == 0){
                System.out.println("Load report: Loan failed - out of stock. "
                        +publications[scanPub].getNumOfPub()+ " - "
                        +"\t"+"qty:"+publications[scanPub].getQty()
                        +"\'"+publications[scanPub].getTitle()+"\'");
            } //if the student has 3 pubs already.
            else if (students[scanStud].getLoanedNum() == 3) {
                System.out.println("Load report: Loan failed - student has already loaned 3 publications");
                System.out.println(students[scanStud]);
                print(students[scanStud].getArray());
            }
            System.out.println("Welcome to the library. Start loan:");
            System.out.println("Insert student number [0," + getIndexStud() + "]");
            scanStud = scanner.nextInt();
        }
        sort(publications);
        printSorted(publications);

    }

    /**
     * print the array of publications the student has in loan.
     * @param publications the array of the student of loan pub.
     */
    public static void print(Publication[] publications) {
        int j = 0;
        System.out.println("List of loaned publications:");
        while (publications[j] != null && j < 2) {
            System.out.print(publications[j].getNumOfPub() + " - ");
            System.out.print(publications[j].getClass().getSimpleName() + "\t");
            System.out.println(publications[j]);
            j++;
        }
    }

    /**
     * print the array as a library status of qty of publications
     * @param publications the array of the library.
     */
    public static void printSorted (Publication[] publications) {
        System.out.println("Report on library status:"+"\n"
                +"==================================================");
        for (int i = 0; i < getIndexOfPub()-10 ; i++) {
            System.out.print(publications[i].getNumOfPub() + " - ");
            System.out.print(publications[i].getClass().getSimpleName() + "\t");
            System.out.println("qty:"+publications[i].getQty()+"\'"+publications[i].getTitle()+"\'");
        }
    }
}