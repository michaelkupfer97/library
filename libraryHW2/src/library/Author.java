package library;

import java.util.Objects;
/**
 * Represents an author of a publication.
 */
public class Author {
    /**
     * The name of the author.
     */
    private String name;
    /**
     * The email address of the author.
     */
    private String email;
    /**
     * Constructs an author with the given name and email address.
     * @param name the name of the author
     * @param email the email address of the author
     */
    public Author (String name,String email){
        this.name=name;
        this.email=email;
    }
    /**
     * Returns the name of the author.
     * @return the name of the author
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the email address of the author.
     * @return the email address of the author
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets the name of the author.
     * @param name the new name of the author
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Sets the email address of the author.
     * @param email the new email address of the author
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Returns a string representation of the author in the format "name at email".
     * @return a string representation of the author
     */
    @Override
    public String toString() {
        return name+" at "+email;
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o the object to compare to
     * @return true if this object is the same as the o argument; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(email, author.email);
    }

}
