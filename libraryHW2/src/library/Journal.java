package library;

import java.util.Objects;
/**
 * Represents a journal publication in a library.
 */
public class Journal extends Publication{
    /**
     * The year of the journal publication.
     */
    private int year;
    /**
     * The issue number of the journal publication.
     */
    private  int issue;
    /**
     * Constructs a new journal publication with the given title, publisher, quantity, issue number, and year.
     * @param title the title of the journal publication
     * @param publisher the publisher of the journal publication
     * @param qty the quantity of the journal publication
     * @param issue the issue number of the journal publication
     * @param year the year of the journal publication
     */
    public Journal(String title, String publisher,int qty,int issue,int year ){
        super(title, publisher, qty);
        this.year=year;
        this.issue=issue;
    }
    /**
     * Returns the year of the journal publication.
     * @return the year of the journal publication
     */
    public int getYear() {
        return year;
    }
    /**
     * Returns the issue number of the journal publication.
     * @return the issue number of the journal publication
     */
    public int getIssue() {
        return issue;
    }
    /**
     * Sets the year of the journal publication.
     * @param year the year of the journal publication
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Sets the issue number of the journal publication.
     * @param issue the issue number of the journal publication
     */
    public void setIssue(int issue) {
        this.issue = issue;
    }
    /**
     * Returns a string representation of the journal publication.
     * @return a string representation of the journal publication
     */
    @Override
    public String toString() {
        return " "+getTitle() +
                "(" + issue +")"+ "\n"+"\t"+
                getPublication()+
                "(" + year+")" ;
    }
    /**
     * Determines if this journal publication is equal to another object.
     * @param o the object to compare to
     * @return true if the object is a journal publication with the same title, publisher, quantity, issue number, and year, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Journal journal = (Journal) o;
        return year == journal.year && issue == journal.issue;
    }

}
