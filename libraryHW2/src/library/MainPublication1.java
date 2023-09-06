package library;

import static library.Publication.getIndexOfPub;

public class MainPublication1 {

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
        publications[1] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[2] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1);
        publications[3] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3);
        publications[4] = new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1], "Maxwell Perkins", 1925);
        publications[5] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
        publications[6] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[7] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2], "", 2002);
        publications[8] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2);
        publications[9] = new Journal("Nature", "Springer Nature",
                5, 590, 2021);

        print(publications);

    }

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
}