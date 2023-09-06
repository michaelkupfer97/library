package library;


import java.util.Arrays;

import static library.Publication.getIndexOfPub;

public class MainPublication2 {


    public static void main(String[] args) {

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


        //print the array by the order they entered to the system.
        print(publications);
        //sorting the array by demands of question.
        sort(publications);
        //print the new sorted array.
        printSorted(publications);


    }

    /**
     * method that get array and print array after if has been sorted
     * @param publications the array of publications
     */
    public static void printSorted (Publication[] publications) {
        System.out.println("List of the publications sorted by 'Book','Journal', 'Article', 'Encyclopedia'  : \n" +
                "======================================================");
        for (int i = 0; i < getIndexOfPub()-10 ; i++) {
            System.out.print(publications[i].getNumOfPub() + " - ");
            System.out.print(publications[i].getClass().getSimpleName() + "\t");
            System.out.println(publications[i]);
        }
    }

    /**
     * printing the array by the order they entered to the system
     * @param publications the array of publications
     */
    public static void print (Publication[] publications) {
        System.out.println("List of the publications in the order they were entered: \n" +
                "======================================================");
        int pubindex = getIndexOfPub();
        int j = 0;
        for (int i = 10; i < pubindex; i++) {
            while (i != publications[j].getNumOfPub()) {
                j++;
            }
            System.out.print(i + " - ");
            System.out.print(publications[j].getClass().getSimpleName() + "\t");
            System.out.println(publications[j]);
            j = 0;
        }
    }
//    public static void sort(Publication[] publications){
//        //check the amount of publications in arr
//        int size=0;
//        while (publications[size] !=null)
//            size++;
////create new arr that will be sorted.
//        Publication [] arrnew =new Publication[size];
//
//        int Bindex=0;
//        int Jindex=0;
//        int Aindex=0;
//        int Eindex=0;
//
//        for (int i = 0 ;i < size ; i++){
//            if(publications[i] instanceof Book){
//                arrnew[ Bindex] = publications[i];
//                Bindex++;
//            }else if (publications[i] instanceof Journal && !(publications[i] instanceof Article)){
//                arrnew[ Jindex + Bindex ]=publications[i];
//                Jindex++;
//            } else if (publications[i] instanceof Article && !(publications[i] instanceof Journal)) {
//                arrnew[ Aindex + Jindex + Bindex ]=publications[i];
//                Aindex++;
//            } else if (publications[i] instanceof Encyclopedia && !(publications[i] instanceof Journal)) {
//                arrnew[ Bindex + Jindex + Aindex + Eindex ]=publications[i];
//                Eindex++;
//            }
//        }
//        for (int i =0; i< size;i++) publications[i]=arrnew[i];
//    }

    /**
     * sorting the array by book journal article encyclopedia and publication.
     * @param publications the publications array
     */
    public static void sort (Publication[] publications) {

        //Encyclopedia
        for (int i = 1; i < getIndexOfPub()-10; i++) {
            deepSortEncyclopedia(publications, i);
        }
        //Article
        for (int i = 1; i < getIndexOfPub()-10; i++) {
            deepSortArticle(publications, i);
        }
        //Journal
        for (int i = 1; i < getIndexOfPub()-10 ; i++) {
            deepSortJournal(publications, i);
        }
        //Book
        for (int i = 1; i < getIndexOfPub()-10 ; i++) {
            deepSortBook(publications, i );
        }
    }

    /**
     * sorting the books to the beginning of the array
     * @param publications the array of publications
     * @param i the index
     */
     public static void deepSortBook(Publication[] publications, int i){
        Publication temp ;
        while (i > 0 && publications[i] instanceof Book && !(publications[i-1] instanceof Book)){
            temp=publications[i];
            publications[i]= publications[i-1];
            publications[i-1]=temp;
            i--;
        }
    }
    /**
     * sorting the journal to the beginning of the array
     * @param publications the array of publications
     * @param i the index
     */
    public static void deepSortJournal(Publication[] publications, int i){
        Publication temp ;
        while (i>0 && publications[i] instanceof Journal && !(publications[i-1] instanceof Journal)){
            temp=publications[i];
            publications[i]= publications[i-1];
            publications[i-1]=temp;
            i--;
        }
    }
    /**
     * sorting the article to the beginning of the array
     * @param publications the array of publications
     * @param i the index
     */
    public static void deepSortArticle(Publication[] publications, int i){
        Publication temp ;
        while (i>0 && publications[i] instanceof Article && !(publications[i-1] instanceof Article)){
            temp=publications[i];
            publications[i]= publications[i-1];
            publications[i-1]=temp;
            i--;
        }
    }
    /**
     * sorting the encyclopedia to the beginning of the array
     * @param publications the array of publications
     * @param i the index
     */
    public static void deepSortEncyclopedia(Publication[] publications, int i){
        Publication temp ;
        while (i>0 && publications[i] instanceof Encyclopedia && !(publications[i-1] instanceof Encyclopedia)){
            temp=publications[i];
            publications[i]= publications[i-1];
            publications[i-1]=temp;
            i--;
        }
    }
}