package library;

import java.util.Objects;
/**
 * Represents an article in a journal.
 * Extends the Journal class to inherit the attributes of the journal it belongs to.
 */
public class Article extends Journal{
    /**
     * The name of the article.
     */
    private String artName;
    /**
     * The author of the article.
     */
    private Author author;
    /**
     * The URL of the article.
     */
    private String URL;
    /**
     * Constructs an Article object with the specified parameters.
     * @param title The title of the journal the article belongs to.
     * @param publisher The publisher of the journal the article belongs to.
     * @param qty The quantity of the journal.
     * @param issue The issue number of the journal the article belongs to.
     * @param year The year of publication of the journal the article belongs to.
     * @param artName The name of the article.
     * @param author The author of the article.
     * @param url The URL of the article.
     */
     public Article(String title, String publisher,int qty,int issue,int year,String artName,Author author,String url){
         super(title, publisher, qty, issue, year);
         this.artName=artName;
         this.author=author;
         this.URL=url;
     }
    /**
     * Returns the name of the article.
     * @return The name of the article.
     */
    public String getArtName() {
        return artName;
    }
    /**
     * Sets the name of the article.
     * @param artName The name of the article.
     */
    public void setArtName(String artName) {
        this.artName = artName;
    }
    /**
     * Returns the author of the article.
     * @return The author of the article.
     */
    public Author getAuthor() {
        return author;
    }
    /**
     * Sets the author of the article.
     * @param author The author of the article.
     */
    public void setAuthor(Author author) {
        this.author = author;
    }
    /**
     * Returns the URL of the article.
     * @return The URL of the article.
     */
    public String getURL() {
        return URL;
    }
    /**
     * Sets the URL of the article.
     * @param URL The URL of the article.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Returns a String representation of the Article object.
     * @return A String representation of the Article object.
     */
    @Override
    public String toString() {
        return "\'" +artName + "\'"+
                ", by " + author +"\n"+
                getTitle()+"("+getIssue() +")" +"\n"+"\t"+
                 getPublication()+"("+getYear() +")"
                +"\n"+ URL ;
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o The object to compare.
     * @return True if this object is the same as the o argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Article article = (Article) o;
        return Objects.equals(artName, article.artName) && Objects.equals(author, article.author) && Objects.equals(URL, article.URL);
    }

}
