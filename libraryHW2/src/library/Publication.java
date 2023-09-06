package library;

import java.util.Objects;

/**
 * The Publication class represents a publication, that has a title, publisher, and quantity.
 * Each Publication object is assigned a unique identifier number, starting from 10 and incrementing
 * for each new object created.
 */
public class Publication {
    /**
     * the title of the publication
     */
    private String title;
    /**
     * the publication
     */
    private String publication;
    /**
     * the quantity of the publication in the library
     */
    private int qty;
    /**
     * static veritable that goes up each time the builder is activated.
     */
    private static int indexOfPub= 10;
    /**
     * final number index to the publication in order they entered to the system.
     */
    private final int numOfPub ;
    /**
     * Constructor for the Publication class.
     * @param title the title of the publication
     * @param publisher the publisher of the publication
     * @param qty the quantity of the publication
     */
    public Publication(String title,String publisher,int qty){
        this.title=title;
        this.publication=publisher;
        this.qty=qty;
        numOfPub=indexOfPub;
        indexOfPub++;
    }
    // Getters and setters for the instance variables
    public String getTitle() {
        return title;
    }
    public String getPublication() {
        return "published by "+publication;
    }
    public int getQty() {
        return qty;
    }
    public static int getIndexOfPub() {
        return indexOfPub;
    }
    public int getNumOfPub() {
        return numOfPub;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    /**
     * Returns a String representation of the Publication object.
     * @return a String representation of the Publication object
     */
    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", publication='" + publication + '\'' +
                ", qty=" + qty +
                ", numOfPub=" + numOfPub +
                '}';
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o the object to compare to
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return qty == that.qty && numOfPub == that.numOfPub &&
                Objects.equals(title, that.title) &&
                Objects.equals(publication, that.publication);
    }

}
