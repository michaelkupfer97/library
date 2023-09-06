package library;

import java.sql.Struct;
import java.util.Objects;
/**
 * A class representing a book publication in a library.
 * Extends the Publication class and adds an author, editor, and year of publication.
 */
public class Book extends Publication{
    /**
     * the author of the book
     */
    private Author author;
    /**
     * the editor of the book
     */
    private String editor;
    /**
     * the year that the book was written
     */
    private int year;
    /**
     * Creates a new Book object with the specified parameters.
     * @param title     the title of the book
     * @param publisher the publisher of the book
     * @param qty       the quantity of the book available in the library
     * @param author    the author of the book
     * @param editor    the editor of the book
     * @param year      the year the book was published
     */
    public Book(String title,String publisher,int qty, Author author,String editor,int year){
        super(title,publisher,qty);
        this.author=author;
        this.editor=editor;
        this.year=year;
    }
    /**
     * Returns the author of the book.
     * @return the author of the book
     */
    public Author getAuthor(){
        return author;
    }
    /**
     * Returns the editor of the book.
     * @return the editor of the book
     */
    public String getEditor(){
        return editor;
    }
    /**
     * Returns the year the book was published.
     * @return the year the book was published
     */
    public int getYear(){
        return year;
    }
    /**
     * Sets the author of the book to a new value.
     * @param newA the new author of the book
     */
    public void setAuthor(Author newA){
        this.author=newA;
    }
    /**
     * Sets the editor of the book to a new value.
     * @param newE the new editor of the book
     */
    public void setEditor(String newE){
        this.editor=newE;
    }
    /**
     * Sets the year the book was published to a new value.
     * @param newY the new year the book was published
     */
    public void setYear(int newY){
        this.year=newY;
    }
    /**
     * Returns a String representation of the Book object.
     * @return a String representation of the Book object
     */
    @Override
    public String toString() {
        return " '"+ getTitle() +" '"+
                " by " + author +
                " "+ "\n"+"\t"+
                getPublication()+
                " edited by " + editor +
                "(" + year + ")";
    }
    /**
     * Returns true if the Book object passed in is equal to this Book object, and false otherwise.
     * @param o the Book object to compare to this Book object
     * @return true if the Book object passed in is equal to this Book object, and false otherwise
     */
    @Override
    public boolean equals(Object o){
        if (this==o)return true;
        if (o==null || getClass() !=o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return year== book.year&&Objects.equals(author,book.author)&&
                Objects.equals(editor,book.editor);

    }
}
