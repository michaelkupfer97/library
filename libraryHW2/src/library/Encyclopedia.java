package library;

import java.util.Objects;
/**
 * A class representing an encyclopedia publication.
 * Inherits from the Publication class.
 */
public class Encyclopedia extends Publication{
    /**
     * the volume of the encyclopedia
     */
    private int volume;
    /**
     * the editor of the encyclopedia
     */
    private String editor;
    /**
     * Constructor for the Encyclopedia class.
     * @param title the title of the encyclopedia
     * @param publisher the publisher of the encyclopedia
     * @param qty the quantity of the encyclopedia
     * @param editor the editor of the encyclopedia
     * @param volume the volume of the encyclopedia
     */
    public Encyclopedia(String title,String publisher, int qty, String editor,int volume ){
        super(title,publisher,qty);
        this.volume=volume;
        this.editor=editor;
    }
    /**
     * Gets the volume of the encyclopedia.
     * @return the volume of the encyclopedia
     */
    public int getVolume() {
        return volume;
    }
    /**
     * Gets the editor of the encyclopedia.
     * If the editor is not known, returns "unknown".
     * @return the editor of the encyclopedia, or "unknown" if not known
     */
    public String getEditor() {
        if (editor=="")return "unknown";
        else  return editor;
    }
    /**
     * Sets the volume of the encyclopedia.
     * @param volume the new volume of the encyclopedia
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }
    /**
     * Sets the editor of the encyclopedia.
     * @param editor the new editor of the encyclopedia
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }
    /**
     * Returns a string representation of the encyclopedia.
     * @return a string representation of the encyclopedia
     */
    @Override
    public String toString() {
        return " " + getTitle()+
                " vol." + volume + "\n"+"\t"+
                getPublication()+
                " edited by " + getEditor() ;
    }
    /**
     * Checks if the encyclopedia is equal to another object.
     * @param o the object to compare to
     * @return true if the encyclopedia is equal to the other object, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Encyclopedia that = (Encyclopedia) o;
        return volume == that.volume && Objects.equals(editor, that.editor);
    }


}
